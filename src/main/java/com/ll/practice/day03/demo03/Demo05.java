package com.ll.practice.day03.demo03;

/**
 * @Author lin_li
 * @Date 2022/6/14 19:33
 */
public class Demo05 {
   public void max(int a,int b){
       if(a>b){
           System.out.println(a);
       }else {
           System.out.println(b);
       }
   }

   public void max(double a,double b){
       if(a>b){
           System.out.println(a);
       }else {
           System.out.println(b);
       }
   }

   public void max(double a,double b,double c){
       System.out.println(a>b?(a>c?a:c):(b>c?b:c));
   }
}
