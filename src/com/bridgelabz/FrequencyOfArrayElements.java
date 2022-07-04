package com.bridgelabz;
import java.util.Arrays;

public class FrequencyOfArrayElements {
    public static void countArrayElements(int arr[],int n) {
        boolean visit[] = new boolean[n];
        Arrays.fill(visit, false);
        System.out.println("elements | frequency");
        int i;
        int count = 0;
        for (i = 0; i < n; i++) {
            if (visit[i] == true)
                continue;

            count = 1;
            for (int j = i + 1; j < n; j++){
                if (arr[i] == arr[j]){
                    visit[j] = true;
                    count++;
                 }
            }
        System.out.println("     " + arr[i] + "  |   " + count);
        }
    }
    public static void main(String[] args) {
         int arr[] = {10,30,40,20,30,60,10,40,60,10,90};
         int n = arr.length;
         countArrayElements(arr,n);
    }
}
