package com.ll.practice.day01;

/**
 * @Author lin_li
 * @Date 2022/6/12 16:16
 */
public class Demo19 {
    public static void main(String[] args) {
        //求1到100之间所有偶数的和。用for和while语句分别完成。
        int sum = 0;
        /*for (int i = 1; i < 101; i++) {
            if(i%2==0){
                sum+=i;
            }
        }*/

        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println(sum);
    }
}
