package com.ll.practice.day01;

/**
 * @Author lin_li
 * @Date 2022/6/12 10:40
 */
public class Demo16 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
