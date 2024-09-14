package com.myprojects;

public class Factorial {
    public static void main(String[] args) {
        int n=6;
        long fact=1;
        for(int i=1; i<=6; i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+": "+fact);
    }
}
