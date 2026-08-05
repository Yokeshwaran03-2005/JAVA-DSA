package com.Arrays;

public class MaxofArray {
    static void main() {
        int[] arr = {22, 55, 78, 98, 100};
        System.out.println(maxRange(arr,2,4));
    }

    static int maxRange(int[] arr,int start,int end) {
        int maxvalue =arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        return maxvalue;



//    static int max(int[] arr) {
//        int maxvalue =arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>maxvalue){
//                maxvalue=arr[i];
//            }
//        }
//        return maxvalue;


    }
}
