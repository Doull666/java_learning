package com.ll.practice.day03.demo01;

/**
 * @Author lin_li
 * @Date 2022/6/16 21:50
 */
public class Student extends Person{
    long number;
    int math;
    int english;
    int computer;

    public Student(String name, char sex, int age, long number, int math, int english, int computer) {
        super(name, sex, age);
        this.number = number;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", number=" + number +
                ", math=" + math +
                ", english=" + english +
                ", computer=" + computer +
                '}';
    }
}
