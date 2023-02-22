package com.ll.practice.day03.demo06;

/**
 * @Author lin_li
 * @Date 2022/6/15 19:23
 */
public class Person {
    private String name;
    private int age;
    private String school;
    private String major;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Person(String name, int age, String school, String major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }

}
