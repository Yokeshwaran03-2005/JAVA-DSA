package com.sorting;

import java.util.Arrays;

public class Bubble {
    static void main() {
        int[] arr={10,43,67,92,34,56 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void bubble(int[]arr){
        boolean swapped = false;
        //run the step for n-1 times
        for(int i=0;i<arr.length;i++){
            //for each step max items cames at the last respective index
            for(int j=1;j<arr.length-i;j++){
                //swap if the item previous is smaller than previous one
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            //if the did not swap the particular value of i,it means the array is sorted hence stop the array

            if(!swapped){
                break;
            }
        }
    }
}
