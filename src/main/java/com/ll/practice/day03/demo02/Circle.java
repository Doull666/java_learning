package com.ll.practice.day03.demo02;

/**
 * @Author lin_li
 * @Date 2022/6/16 22:17
 */
public class Circle {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

}
