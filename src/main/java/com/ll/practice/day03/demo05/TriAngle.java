package com.ll.practice.day03.demo05;

/**
 * @Author lin_li
 * @Date 2022/6/15 19:16
 */
public class TriAngle {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea(double base, double height) {
        return (base * height) / 2;
    }

}
