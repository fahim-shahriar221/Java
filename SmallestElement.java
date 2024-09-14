package com.myprojects;

public class SmallestElement {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,6,11,31};
        int min=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Smallest element is: "+min);
    }
}
