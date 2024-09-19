package com.myprojects;

public class Factor {
    public static void main(String[] args) {
        int n=11;
        System.out.println("The factors of "+n+" are:");
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
