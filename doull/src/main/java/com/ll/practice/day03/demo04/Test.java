package com.ll.practice.day03.demo04;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @Author lin_li
 * @Date 2022/6/17 23:53
 */
public class Test {
    public static void main(String[] args) {
        Order lin_li = new Order(1, "lin_li");
        Order lin_li1 = new Order(1, "lin_li");
        Order juan_tan = new Order(2, "juan_tan");

        System.out.println(lin_li.equals(lin_li1));
    }
}
