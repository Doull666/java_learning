package com.ll.practice.day03.demo03;

/**
 * @Author lin_li
 * @Date 2022/6/17 21:40
 */
public class Graduate extends Student{
    public String major="IT";

    @Override
    public String toString() {
        return "Graduate{" +
                "major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
}
