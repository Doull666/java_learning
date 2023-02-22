package com.ll.practice.day02.demo05;

/**
 * @Author lin_li
 * @Date 2022/6/16 21:10
 */
public class ManKind {
    public int sex;
    public int salary;

    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("man");
        } else if (sex == 0) {
            System.out.println("woman");
        }
    }

    public void employeed() {
        if (salary == 0) {
            System.out.println("no job");
        } else {
            System.out.println("job");
        }
    }

}
