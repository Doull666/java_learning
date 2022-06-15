package com.ll.practice.day03.demo01;

/**
 * @Author lin_li
 * @Date 2022/6/14 18:44
 */
public class Student {
    private String name;
    private int age;
    private String course;
    private String hobby;

    public void info() {
        System.out.println("这个学生叫 " + name + " 今年 " + age + " 参加的课程 " + course + " 兴趣 " + hobby);
    }
}
