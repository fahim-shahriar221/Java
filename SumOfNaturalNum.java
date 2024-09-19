package com.myprojects;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        int sum=0;
        int a=1;
        int b=100;
        for (int i=a;i<=b;i++){
            sum+=i;
        }
        System.out.println("Sum of Natural Numbers 1 to 100: "+sum);
    }
}
