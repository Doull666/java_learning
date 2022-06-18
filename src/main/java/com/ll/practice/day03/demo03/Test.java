package com.ll.practice.day03.demo03;

/**
 * @Author lin_li
 * @Date 2022/6/17 21:40
 */
public class Test {
    public static void main(String[] args) {
        Person graduate = new Graduate();

        System.out.println(graduate.toString());

        if(graduate instanceof Graduate){
            System.out.println("a graduate");
        }
    }
}
