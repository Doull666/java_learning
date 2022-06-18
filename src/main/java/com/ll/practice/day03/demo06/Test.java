package com.ll.practice.day03.demo06;

/**
 * @Author lin_li
 * @Date 2022/6/18 8:30
 */
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle();

        System.out.println(circle.getColor()==circle1.getColor());

        System.out.println(circle.equals(circle1));

        System.out.println(circle.toString());
    }
}
