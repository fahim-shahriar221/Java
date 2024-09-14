package com.myprojects;

public class LargestElement {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,6,11,31};
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("Largest element is: "+max);
    }
}
