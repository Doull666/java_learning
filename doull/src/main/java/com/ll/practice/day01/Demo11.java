package com.ll.practice.day01;

import java.util.Scanner;

/**
 * @Author lin_li
 * @Date 2022/6/12 9:37
 */
public class Demo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符：");
        String input = scanner.next();

        switch (input){
            case "a":
                System.out.println("A");
                break;
            case "b":
                System.out.println("B");
                break;
            case "c":
                System.out.println("C");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
