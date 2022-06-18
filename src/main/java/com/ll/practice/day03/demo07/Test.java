package com.ll.practice.day03.demo07;

/**
 * @Author lin_li
 * @Date 2022/6/15 19:34
 */
public class Test {
    public static void main(String[] args) {
        Boy jack = new Boy("jack", 28);

        Girl rose = new Girl("rose");

        rose.marry(jack);

        System.out.println("=====================================");
        jack.marry(rose);

    }
}
