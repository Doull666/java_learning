package com.ll.practice.day01;

import java.util.Scanner;

/**
 * @Author lin_li
 * @Date 2022/6/12 8:43
 */
public class Demo06 {
    public static void main(String[] args) {
        //创建输入器按钮
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入小明的期末成绩：");
        int score = scanner.nextInt();
        if (score == 100) {
            System.out.println("奖励一辆BMW");
        } else if (score > 80 && score <= 99) {
            System.out.println("奖励一台iphone5s");
        } else if (score >= 60 && score <= 80) {
            System.out.println("奖励一本参考书");
        }else {
            System.out.println("木有奖励哦");
        }
    }
}
