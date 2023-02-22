package com.ll.practice.day01;

import java.util.Scanner;

/**
 * @Author lin_li
 * @Date 2022/6/12 16:21
 */
public class Demo20 {
    public static void main(String[] args) {
//        从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
        Scanner scanner = new Scanner(System.in);
        int zhen = 0;
        int fu = 0;
        while (true) {
            //键盘输入数字
            System.out.println("请键盘输入数字：");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            } else if (input > 0) {
                zhen++;
            } else {
                fu++;
            }

        }
        System.out.println("正：" + zhen + "，负:" + fu);
    }
}
