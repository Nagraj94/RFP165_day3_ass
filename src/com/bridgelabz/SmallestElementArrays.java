package com.bridgelabz;
import java.util.Arrays;

public class SmallestElementArrays {
    static int arr[] = {1011,2022,1997,8997,3745,8901};
    static int largestElement(){

        int min = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min = arr[i];
        }
        System.out.println(min);
        return min;
    }
    public static void main(String[] args) {
        largestElement();

        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("smallest element in array: "+min);
    }
}
