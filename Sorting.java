package com.myprojects;

public class Sorting {
    public static void main(String[] args) {
        int [] arr = {2,4,1,3,6,11,31};
        System.out.println("Main array: ");
        for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
        }
        for (int i=0; i< arr.length-1;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nAfter ascending: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        for (int i=0; i< arr.length-1;i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nAfter descending: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
