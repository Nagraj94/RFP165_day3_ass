package com.bridgelabz;

public class ReverseArrayElement {
    static int arr[] = {1011,2022,1997,8997,3745,8901};
    static void reverseElement(int[] a, int n) {

        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: ");
        for (int k = 0; k < n; k++) {
            System.out.print(b[k]+", ");
        }
    }
    public static void main(String[] args) {
        reverseElement(arr, arr.length);
    }
}
