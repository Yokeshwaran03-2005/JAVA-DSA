package com.sorting;

import java.util.Arrays;

public class Cyclic {
    static void main(String[] yokesh) {
        int [] arr={4,3,2,7,8,2,3,1};

        System.out.println(sort(arr));

    }
     static int sort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }

        }
         for(int index=0;index<arr.length;index++){
             if(arr[index]!=index){
                 return index;
             }
         }
         return arr.length;



     }

     static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


}
