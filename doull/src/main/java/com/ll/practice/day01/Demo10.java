package com.ll.practice.day01;

/**
 * @Author lin_li
 * @Date 2022/6/12 9:22
 */
public class Demo10 {
    public static void main(String[] args) {
        String season = "summer";
        if ("spring".equals(season)) {
            System.out.println("春暖花开");
        } else if ("summer".equals(season)) {
            System.out.println("夏日炎炎");
        } else if ("autumn".equals(season)) {
            System.out.println("秋高气爽");
        } else if ("winter".equals(season)) {
            System.out.println("冬雪皑皑");
        } else {
            System.out.println("季节输入有误");
        }
    }
}
