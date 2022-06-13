package com.ll.practice.day01;

import java.util.Scanner;

/**
 * @Author lin_li
 * @Date 2022/6/12 10:31
 */
public class Demo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = scanner.nextInt();

        switch (score / 10) {
            case 9:
            case 10:
                System.out.println("A");
                break;
            case 7:
            case 8:
                System.out.println("B");
                break;
            case 6:
                System.out.println("C");
                break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("D");
                break;
        }
    }
}
