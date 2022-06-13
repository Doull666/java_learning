package com.ll.practice.day02.demo04;

/**
 * @Author lin_li
 * @Date 2022/6/13 22:43
 */
public class Demo044 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};


        int[] arr2 = arr1;

        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 == 0) {
                arr2[i] = i;
            }
        }

        for (int i : arr1) {
            System.out.println(i);
        }

    }
}
