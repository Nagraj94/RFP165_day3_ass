package com.bridgelabz;

public class PrintArrayElements {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String petArr[] = {"dog", "cat", "cow", "hen", "bull"};
        String carArr[] = {"audi","tata","mahindra","rolls roy"};

        for (int i = 0; i < arr1.length; i++)
                System.out.print(arr1[i] + " ");
        System.out.println(" ");
        System.out.println("*****************");
        for (int j=0; j < petArr.length; j++)
            System.out.print(petArr[j] + " ");
        System.out.println(" ");
        System.out.println("*****************");
        for (int k=0; k< carArr.length;k++)
            System.out.println(carArr[k]+" ");
    }
}
