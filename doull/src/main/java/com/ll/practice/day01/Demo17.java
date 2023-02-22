package com.ll.practice.day01;

/**
 * @Author lin_li
 * @Date 2022/6/12 15:50
 */
public class Demo17 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 7 == 0) {
                num++;
                sum += i;
            }
        }
        System.out.println("一共：" + num + "个，总和：" + sum);
    }
}
