package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        swap(arr,3,5);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[]arr,int index3,int index5 ){
        int temp =arr[index3];
        arr[index3]=arr[index5];
        arr[index5]=temp;
    }
}
