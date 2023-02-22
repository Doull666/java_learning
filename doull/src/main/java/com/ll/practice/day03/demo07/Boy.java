package com.ll.practice.day03.demo07;

/**
 * @Author lin_li
 * @Date 2022/6/15 19:30
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println(girl.getName() + " 嫁给我 " + this.name + "吧！！！");
        shut();
    }

    public void shut(){
        System.out.println("嫁给我吧！！！");
    }
}
