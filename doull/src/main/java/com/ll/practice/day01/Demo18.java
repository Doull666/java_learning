package com.ll.practice.day01;

/**
 * @Author lin_li
 * @Date 2022/6/12 15:56
 */
public class Demo18 {
    public static void main(String[] args) {
        int bai = 0;
        int shi = 0;
        int ge = 0;

        for (int i = 100; i < 1000; i++) {
            bai = i / 100;
            shi = (i - bai * 100) / 10;
            ge = i - shi * 10 - bai * 100;
            if (i == bai * bai * bai + shi * shi * shi + ge * ge * ge) {
                System.out.println("水仙花数：" + i);
            }
        }
    }
}
