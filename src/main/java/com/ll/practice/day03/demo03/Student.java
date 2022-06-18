package com.ll.practice.day03.demo03;

/**
 * @Author lin_li
 * @Date 2022/6/17 21:39
 */
public class Student extends Person{
    protected String school="pku";

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
}
