package com.myprojects;

public class AverageOfArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,6,11,31};
        int sum=0;
        double avg;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        avg=(float)sum/arr.length;
        System.out.println("Average of elements: "+avg);
    }
}
