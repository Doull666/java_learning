package com.ll.practice.day03.demo02;

/**
 * @Author lin_li
 * @Date 2022/6/14 19:00
 */
public class Demo02 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "lin_li";
        person.age = 18;
        person.sex = "man";

        person.study();

        person.showAge();

        person.addAge();
        person.showAge();

        Circle circle = new Circle();
//        circle.radius = 6;
//        System.out.println("面积：" + circle.area());


    }
}
