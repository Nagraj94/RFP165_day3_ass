package com.bridgelabz;
import java.util.Arrays;

public class LargestElementArrays {
    static int arr[] = {1011,2022,1997,8997,3745,8901};
    static int largestElement(){

        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args) {
        largestElement();

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("largest element in array: "+max);
    }
}
