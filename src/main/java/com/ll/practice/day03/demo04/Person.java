package com.ll.practice.day03.demo04;

/**
 * @Author lin_li
 * @Date 2022/6/15 18:58
 */
public class Person {
    private int age;
    private String name;

    public Person() {
        age = 18;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("设置超过人类合法年龄！！！");
        }
    }

}
