package com.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.sorting.Selection.swap;

public class Insertion {
    static void main() {
        int[]arr ={4,5,1,2,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j= i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }

            }
        }
    }

}
