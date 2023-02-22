package com.ll.practice.day02.demo05;

/**
 * @Author lin_li
 * @Date 2022/6/16 21:14
 */
public class Kids extends ManKind{
    public int yearsOld;

    public void printAge(){
        System.out.println(yearsOld);
    }

    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.sex=1;
        someKid.salary=1;

        someKid.manOrWoman();
        someKid.employeed();
    }
}
