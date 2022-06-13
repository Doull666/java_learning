package com.ll.practice.day02.demo03;

import java.util.Scanner;

/**
 * @Author lin_li
 * @Date 2022/6/13 20:40
 */
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入学生人数：");
        int num = scanner.nextInt();
        System.out.println("输入" + num + "人的成绩：");
        Student[] stds = new Student[num];

        int max = 0;
        for (int i = 0; i < stds.length; i++) {
            int score = scanner.nextInt();
            Student std = new Student();
            std.score=score;
            stds[i]=std;
            if (max < score) {
                max = score;
            }
        }

        System.out.println("最高分：" + max);
        for (int i = 0; i < stds.length; i++) {
            System.out.println("student " + i + "score is " + stds[i].score);
        }

    }
}
