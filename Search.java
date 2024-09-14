package com.myprojects;

public class Search {
    public static void main(String[] args) {
        int [] arr={31,11,1,4,2,6,3};
        int i;
        System.out.println("Array elements are: ");
        for(i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int x=6;
        for(i=0;i< arr.length;i++){
            if (arr[i]==x) {
                int y = arr[i];
                System.out.println("\n"+x+" found at index: "+i);
            }
        }
    }
}