package com.myprojects;

public class Fibonacci {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int fibonacci,range=0;
        int n=7;
        while(range<n) {
            if(range <= 1) {
                fibonacci = range;
            }else{
                fibonacci = first + second;
                first = second;
                second = fibonacci;
            }
            System.out.print(fibonacci + " ");
            range++;
        }
    }
}