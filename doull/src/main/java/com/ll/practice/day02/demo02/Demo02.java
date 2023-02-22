package com.ll.practice.day02.demo02;

/**
 * @Author lin_li
 * @Date 2022/6/13 20:30
 */
public class Demo02 {
    public static void main(String[] args) {
        Student[] stds = new Student[20];
        for (int i = 1; i < 21; i++) {
            Student std = new Student();
            std.number = i;
            std.state = (int) Math.round(3 * Math.random());
            std.score = (int) Math.round(100 * Math.random());
            stds[i - 1] = std;
        }

        for (Student std : stds) {
            if (std.state == 3) {
                System.out.println(std.number + "_" + std.state + "_" + std.score);
            }
        }

    }
}
