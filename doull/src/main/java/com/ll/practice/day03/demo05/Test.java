package com.ll.practice.day03.demo05;

/**
 * @Author lin_li
 * @Date 2022/6/17 23:58
 */
public class Test {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(1, 2, 3);
        MyDate myDate1 = new MyDate(1, 22, 3);

        System.out.println(myDate.equals(myDate1));
    }
}
