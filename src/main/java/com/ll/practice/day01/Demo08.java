package com.ll.practice.day01;

import java.util.Scanner;

/**
 * @Author lin_li
 * @Date 2022/6/12 9:13
 */
public class Demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身高：");
        int high = scanner.nextInt();
        System.out.println("请输入财富（万元）：");
        double money = scanner.nextDouble();
        System.out.println("是否很帅：");
        String shai = scanner.next();

        if (high >= 180 && money > 1000 && shai.equals("帅")) {
            System.out.println("我一定要嫁个他！！！");
        } else if (high >= 180 || money > 1000 || shai.equals("帅")) {
            System.out.println("嫁吧，比上不足，比下有余");
        } else {
            System.out.println("不嫁！！！");
        }
    }
}
