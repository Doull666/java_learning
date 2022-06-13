package com.ll.practice.day01;

/**
 * @Author lin_li
 * @Date 2022/6/12 10:36
 */
public class Demo15 {
    public static void main(String[] args) {
        for (int i = 1; i < 151; i++) {
            if (i % 3 == 0) {
                System.out.print("foo\t");
            } else if (i % 5 == 0) {
                System.out.print("biz\t");
            } else if (i % 7 == 0) {
                System.out.print("baz\t");
            }
            System.out.println(i);
        }
    }
}
