package com.myprojects;

public class Reverse {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,6,11,31};
        System.out.println("Array 1: ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nReversed Array: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
