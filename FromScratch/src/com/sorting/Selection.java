package com.sorting;

import java.util.Arrays;

public class Selection {
    static void main() {
        int[]arr={4,5,8,9,4,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaing array and swap with cirrent index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr,maxIndex,last);

        }

    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int start,int last){
        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }
}
