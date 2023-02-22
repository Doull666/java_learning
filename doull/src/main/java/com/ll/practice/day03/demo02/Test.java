package com.ll.practice.day03.demo02;

/**
 * @Author lin_li
 * @Date 2022/6/16 22:23
 */
public class Test {
    public static void main(String[] args) {
        /*Cylinder cylinder = new Cylinder();
        cylinder.setLength(10);
        cylinder.setRadius(2.5);
        System.out.println(cylinder.findVolume());
        System.out.println(cylinder.findArea());

        Circle circle = new Circle();
        circle.setRadius(2.5);
        System.out.println(circle.findArea());*/

        Cylinder cylinder = new Cylinder(2.5, 6);
        cylinder.findArea();


    }
}
