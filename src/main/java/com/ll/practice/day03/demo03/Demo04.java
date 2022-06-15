package com.ll.practice.day03.demo03;

/**
 * @Author lin_li
 * @Date 2022/6/14 19:32
 */
public class Demo04 {
    public static void main(String[] args) {
        Demo03 d = new Demo03();
        d.mOL(12);
        d.mOL(12,3);
        d.mOL("dfasd");


        Demo05 demo05 = new Demo05();
        demo05.max(12,32);
        demo05.max(12.3,43.3);
        demo05.max(12.4,56.6,3.3);
    }
}
