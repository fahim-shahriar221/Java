package com.myprojects;

public class Palindrome {
    public static void main(String[] args) {
        int num=1212;
        int originalNum;
        int reversedNum=0;
        originalNum=num;
        while (num!=0){
            int digit = num % 10;
            reversedNum=reversedNum*10 + digit;
            num/=10;
        }
        if(originalNum==reversedNum){
            System.out.println(originalNum+" is Palindrome");
        }else{
            System.out.println(originalNum+" is not Palindrome");
        }
    }
}
