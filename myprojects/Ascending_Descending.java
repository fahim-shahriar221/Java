package com.myprojects;

import java.util.Scanner;

public class Ascending_Descending {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter array elements:");
        for(int i=0; i< n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Main Array: ");
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //Ascending
        System.out.println("\nAfter Ascending:");
        for(int i=0;i< arr.length;i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //Descending
        System.out.println("\nAfter Descending:");
        for(int i=0;i< arr.length;i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
