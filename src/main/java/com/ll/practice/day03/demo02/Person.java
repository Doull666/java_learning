package com.ll.practice.day03.demo02;

/**
 * @Author lin_li
 * @Date 2022/6/14 18:57
 */
public class Person {
    public String name;
    public int age;
    public String sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println(age);
    }

    public void addAge() {
        age += 2;
    }
}
