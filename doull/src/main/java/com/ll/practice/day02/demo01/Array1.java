package com.ll.practice.day02.demo01;

/**
 * @Author lin_li
 * @Date 2022/6/13 20:23
 */
public class Array1 {
    public static void main(String[] args) {
        Pritimive d = new Pritimive();
        d.bool[0]=true;
        d.bool[1]=true;
        d.bool[2]=true;
        for (boolean b : d.bool) {
            System.out.println(b);
        }
    }
}
