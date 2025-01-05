package com.myprojects;

public class Largest_Smallest {
    public static void main(String[] args) {
        int[] arr={10,15,5,20,1};

        //Largest
        int max = arr[0];
        for (int i =0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest Number: "+max);

        //Smallest
        int min = arr[0];
        for (int i =0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Smallest Number: "+min);

        //PrimeNumber
        int n,count=0;
        n=9;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(n+" is a Prime Number");
        }else
            System.out.println(n+ "  is not a Prime Number");
    }
}
