package com.ll.practice.day03.demo05;

/**
 * @Author lin_li
 * @Date 2022/6/15 19:13
 */
public class Point {
    private double x;
    private double y;
    private double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getDistance(double x, double y, double z) {
        return (x * x + y * y + z * z) / 3;
    }
}
