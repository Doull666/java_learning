package com.ll.practice.day02.demo04;

/**
 * @Author lin_li
 * @Date 2022/6/13 22:27
 */
public class Demo04 {
    public static void main(String[] args) {
        //定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，平均值，和值，并输出出来。
        int[] arr = new int[10];
        int max = 0;
        int min = 100;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }

        System.out.println("max:" + max + ",min:" + min + ",sum:" + sum + ",avg:" + sum / arr.length);
    }
}
