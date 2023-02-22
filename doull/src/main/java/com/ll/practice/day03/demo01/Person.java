package com.ll.practice.day03.demo01;

/**
 * @Author lin_li
 * @Date 2022/6/16 21:47
 */
public class Person {
    protected String name;
    protected char sex;
    protected int age;

    public Person(String name,char sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
