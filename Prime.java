package com.myprojects;

public class Prime {
    public static void main(String[] args) {
        int n,count=0;
        n=13;
        for (int i=2; i<n; i++){
                if(n%i==0){
                    count++;
                    break;
                }
        }
            if(count==0){
                System.out.println(+n+" is a Prime Number");
            }else {
                System.out.println(+n+ " is not a Prime Number");
            }
    }
}
