package com.ll.practice.day03.demo03;

/**
 * @Author lin_li
 * @Date 2022/6/17 21:38
 */
public class Person {
    protected String name="Person";
    protected int age=50;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
