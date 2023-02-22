package com.ll.practice.day03.demo01;

/**
 * @Author lin_li
 * @Date 2022/6/14 18:47
 */
public class Teacher {
    private String name;
    private String zhuanye;
    public String course;
    private int tage;

    public void info() {
        System.out.println("这个老师叫 " + name + " 专业 " + zhuanye + " 教授的课程 " + course + " 教龄 " + tage);
    }
}
