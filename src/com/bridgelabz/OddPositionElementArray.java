package com.bridgelabz;

public class OddPositionElementArray {
    static int arr[] = {1011,2022,1997,8997,3745,8901};
    static void oddPosElement() {
        System.out.print("odd position elements are: ");
        int i;

        for (i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        oddPosElement();
    }
}
