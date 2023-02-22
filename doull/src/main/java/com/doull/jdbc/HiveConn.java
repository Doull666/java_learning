package com.doull.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author lin_li
 * @Date 2023/1/12 16:15
 */
public class HiveConn {
    private static String driverName = "org.apache.hive.jdbc.HiveDriver";

    public static void main(String[] args) {
        try {
            Class.forName(driverName);

            Connection con = DriverManager
                    .getConnection("jdbc:hive2://47.102.111.144:10000/mg_dw", "lilin01", "Doull20221221");
            Statement stmt = con.createStatement();

            ResultSet res = stmt.executeQuery("describe dim_sku");

            while (res.next()) {
                System.out.println(res.getString(1) + "\t" + res.getString(2) + "\t" + res.getString(3));
            }


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(1);
        }
    }
}
