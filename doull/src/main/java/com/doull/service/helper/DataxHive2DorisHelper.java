/*
package com.doull.service.helper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jcraft.jsch.SftpException;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



*/
/**
 * @Author lin_li
 * @Date 2023/1/30 18:36
 *//*

public class DataxHive2DorisHelper {

    public JSONObject createDataxJob(String inputSchema, String inputTableName, String outputSchema, List<OriginColumnInfo> inputColumns, String changeDateTableName, String dependencyTableName) {
        JSONObject dataxJson = new JSONObject();
        JSONObject job = new JSONObject();
        JSONObject setting = new JSONObject();
        JSONObject speed = new JSONObject();
        speed.put("channel", 1);
        setting.put("speed", speed);
        JSONObject errorLimit = new JSONObject();
        errorLimit.put("record", 0);
        errorLimit.put("percentage", 0.02);
        setting.put("errorLimit", errorLimit);
        JSONArray content = new JSONArray();
        JSONObject ctt = new JSONObject();
        JSONObject reader = createReader(inputSchema, inputTableName, inputColumns, changeDateTableName, dependencyTableName);
        ctt.put("reader", reader);
        JSONObject writer = createWriter(outputSchema, inputTableName, inputColumns);
        ctt.put("writer", writer);
        content.add(ctt);
        job.put("setting", setting);
        job.put("content", content);
        dataxJson.put("job", job);
        return dataxJson;
    }

    */
/**
     * @标题：生成输入部分
     * @作者：雷传盛
     * @param inputSchemas
     * @param inputTableName
     * @param inputColumns
     * @return
     * @创建时间 2022年7月21日下午3:29:32
     * @修改人
     * @修改时间
     * @修改备注
     *//*

    private JSONObject createReader(String inputSchema, String inputTableName, List<OriginColumnInfo> inputColumns, String changeDateTableName, String dependencyTableName) {
        JSONObject reader = new JSONObject();
        reader.put("name", "rdbmsreader");
        JSONObject parameter = new JSONObject();
        parameter.put("username", "x");
        parameter.put("password", "x");

        JSONObject connectionJson = new JSONObject();
        JSONArray querySqls = new JSONArray();
        StringBuilder querySql = new StringBuilder("SELECT ");
        for(int i=0;i<inputColumns.size();i++) {
            OriginColumnInfo oci = inputColumns.get(i);
            String quat = "";
            if(i < inputColumns.size()-1) {
                quat = ",";
            }
            querySql.append(oci.getColumnName()+quat);
        }

        String condition = "";
        if(StringUtils.isNotEmpty(changeDateTableName) && StringUtils.isNotEmpty(dependencyTableName)) {
            condition = " where ywdt in(select bill_mth from "+inputSchema+"."+changeDateTableName+" where dt = '${dt}' and tb='"+dependencyTableName+"')";
        }
        querySql.append(" FROM "+inputSchema+"."+inputTableName + condition);
        querySqls.add(querySql.toString());
        connectionJson.put("querySql", querySqls);
        connectionJson.put("jdbcUrl", Arrays.asList("jdbc:impala://10.99.10.181:21050/"));
        JSONArray connection = new JSONArray();
        connection.add(connectionJson);
        parameter.put("connection", connection);
        parameter.put("fetchSize", 1024);

        reader.put("parameter", parameter);
        return reader;
    }

    */
/**
     * @标题：创建输出部分
     * @作者：雷传盛
     * @param outputSchema
     * @param inputTableName
     * @param inputColumns
     * @return
     * @创建时间 2022年7月21日下午3:56:44
     * @修改人
     * @修改时间
     * @修改备注
     *//*

    private JSONObject createWriter(String outputSchema, String inputTableName, List<OriginColumnInfo> inputColumns) {
        JSONObject writer = new JSONObject();
        writer.put("name", "mysqlwriter");
        JSONObject parameter = new JSONObject();
        parameter.put("username", "dw_financial");
        parameter.put("password", "dKKb2IF7aomk4Q83U@UXTkWBRWd6VLHu");
        JSONArray columns = new JSONArray();
        for(OriginColumnInfo oci : inputColumns) {
            columns.add(oci.getColumnName());
        }
        parameter.put("column", columns);
        JSONObject connection = new JSONObject();
        connection.put("table", Arrays.asList(outputSchema+"."+inputTableName));
        connection.put("jdbcUrl", "jdbc:mysql://10.99.10.186:9030/example_db");
        parameter.put("connection", Arrays.asList(connection));
        writer.put("parameter", parameter);
        return writer;
    }

    */
/**
     * @标题：初始化hive数据源
     * @作者：雷传盛
     * @return
     * @创建时间 2022年8月4日上午9:36:35
     * @修改人
     * @修改时间
     * @修改备注
     *//*

    public HiveHelper initHive() {
        Map<String, String> hiveDataSourceDetails = new HashMap<>();
        hiveDataSourceDetails.put("jdbc.datasource.url", "jdbc:hive2://47.102.111.144:10000/mg_dw");
        hiveDataSourceDetails.put("jdbc.datasource.username", "root");
        hiveDataSourceDetails.put("jdbc.datasource.password", "root");
        hiveDataSourceDetails.put("jdbc.driverClassName", "org.apache.hive.jdbc.HiveDriver");
        HiveHelper hiveHelper = new HiveHelper();
        hiveHelper.init(hiveDataSourceDetails);
        return hiveHelper;
    }

    */
/**
     * @标题：初始化Doris数据源
     * @作者：雷传盛
     * @return
     * @创建时间 2022年8月4日上午9:35:39
     * @修改人
     * @修改时间
     * @修改备注
     *//*

    public DorisHelper initDoris() {
        DorisHelper dorisHelper = new DorisHelper();
        Map<String, String> dorisDataSourceDetails = new HashMap<>();
        dorisDataSourceDetails.put("jdbc.datasource.url", "jdbc:mysql://106.14.216.3:9030/example_db?serverTimezone=UTC&useSSL=false&useUnicode=yes&characterEncoding=UTF-8&tinyInt1isBit=false");
        dorisDataSourceDetails.put("jdbc.datasource.username", "root");
        dorisDataSourceDetails.put("jdbc.datasource.password", "Abc1234%");
        dorisDataSourceDetails.put("jdbc.driverClassName", "com.mysql.cj.jdbc.Driver");
        dorisHelper.init(dorisDataSourceDetails);
        return dorisHelper;
    }

    */
/**
     * @标题：创建目标表
     * @作者：雷传盛
     * @param hiveHelper
     * @param dorisHelper
     * @param originDbName
     * @param originTableName
     * @param tableComment
     * @param partitionKey
     * @param uniqueColumns
     * @创建时间 2022年8月4日上午9:40:44
     * @修改人
     * @修改时间
     * @修改备注
     *//*

    public void createDorisTable(HiveHelper hiveHelper, DorisHelper dorisHelper, String originDbName, String originTableName, String targetDbName, String tableComment, String partitionKey, String uniqueColumns) {
        String createTableSQL = hiveHelper.createDorisTable(originDbName, originTableName, tableComment, partitionKey, uniqueColumns);

        dorisHelper.createTable("drop table if exists "+targetDbName+"."+originTableName);
        dorisHelper.createTable(createTableSQL);
    }

    public static void main(String[] args) throws IOException, SftpException {
        PropertyConfigurator.configure(Loader.getResource("log4j.properties"));
        Datax4Hive2DorisHelper dataxHelper = new Datax4Hive2DorisHelper();

        HiveHelper hiveHelper = dataxHelper.initHive();
        DorisHelper dorisHelper = dataxHelper.initDoris();

		*/
/*String originDbName = "mg_dw";
		String originTableName = "dwm_mad_rk_refill_value";
		String targetDbName = "example_db";
		String tableComment = "笔芯产品产值";
		String partitionKey = "ywdt";
		String uniqueColumns = "ywdt,bill_no,material_code,factory_code,workshop_code,source_db";
		String changeDateTableName = "dwd_mad_bill_change_date";
		String dependencyTableName = "dwd_mad_stk_yd_dtl";*//*

        String originDbName = "mg_dw";
        String originTableName = "ads_mad_mll_bgsd_mth_report";
        String targetDbName = "example_db";
        String tableComment = "办公赛道预算品类毛利率表";
        String partitionKey = "dim_year";
        String uniqueColumns = "dim_year,id";
        String changeDateTableName = null;
        String dependencyTableName = null;
        dataxHelper.createDorisTable(hiveHelper, dorisHelper, originDbName, originTableName, targetDbName, tableComment, partitionKey, uniqueColumns);
        List<OriginColumnInfo> columns = dorisHelper.getColumnInfos(targetDbName, originTableName);
        JSONObject dataxJob = dataxHelper.createDataxJob(originDbName, originTableName, targetDbName, columns, changeDateTableName, dependencyTableName);
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

        SFTPUtil sftp = new SFTPUtil("root", "Mg#hdp@202106", "47.102.124.66", 22);
        sftp.login();
        sftp.upload("/home/hadoop/job/ads/mad/datax", originTableName + ".json", gson.toJson(dataxJob), "UTF-8");
        sftp.logout();
    }

}
*/
