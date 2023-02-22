package com.ll.practice.day03.demo02;

/**
 * @Author lin_li
 * @Date 2022/6/16 22:19
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        this.length = 1;
    }

    public Cylinder(double length) {
        this.length = length;
    }

    public Cylinder(double radius, double length) {
        super(radius);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return super.findArea() * length;
    }

    @Override
    public double findArea() {
        return 2 * Math.PI * super.getRadius() * this.length;
    }
}
