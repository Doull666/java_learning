package com.ll.practice.day03.demo06;

/**
 * @Author lin_li
 * @Date 2022/6/18 8:27
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(){
        this.color="white";
        this.weight=1.0;
    }

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
