package com.ll.practice.day03.demo07;

/**
 * @Author lin_li
 * @Date 2022/6/15 19:29
 */
public class Girl {
    private String name;

    public Girl() {
    }

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy){
        System.out.println(this.name+" 嫁给男孩 "+ boy.getName());
    }
}
