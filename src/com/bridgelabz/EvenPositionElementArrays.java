package com.bridgelabz;

public class EvenPositionElementArrays {
    static int arr[] = {1011,2022,1997,8997,3745,8901};
    static void evenPosElement() {
        System.out.print("even position elements are: ");
        int i;

        for (i = 1; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        evenPosElement();
    }
}
