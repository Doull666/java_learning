package com.ll.practice.day03.demo05;

/**
 * @Author lin_li
 * @Date 2022/6/15 19:18
 */
public class Test {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle(12.4, 22.2);

        System.out.println(triAngle.getArea(triAngle.getBase(), triAngle.getHeight()));
    }
}
