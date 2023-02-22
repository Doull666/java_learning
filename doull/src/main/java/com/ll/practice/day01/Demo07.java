package com.ll.practice.day01;

import java.util.Scanner;

/**
 * @Author lin_li
 * @Date 2022/6/12 8:48
 */
public class Demo07 {
    public static void main(String[] args) {
        //编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else),并且从小到大输出
        Scanner scanner = new Scanner(System.in);
        //输入第一个数
        System.out.println("请输入第一个数：");
        int one = scanner.nextInt();
        //输入第二个数
        System.out.println("请输入第二个数：");
        int two = scanner.nextInt();
        //输入第三个数
        System.out.println("请输入第三个数：");
        int three = scanner.nextInt();

        if (one > two) {
            if (two > three) {
                System.out.println(one + "," + two + "," + three);
            } else {
                if (one > three) {
                    System.out.println(one + "," + three + "," + two);
                } else {
                    System.out.println(three + "," + one + "," + two);
                }
            }
        } else {
            if (one > three) {
                System.out.println(two + "," + one + "," + three);
            } else {
                if (two > three) {
                    System.out.println(two + "," + three + "," + one);
                } else {
                    System.out.println(three + "," + two + "," + one);
                }
            }
        }
    }
}
