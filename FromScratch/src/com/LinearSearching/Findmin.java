package com.LinearSearching;

public class Findmin {
    static void main(String[] args) {
        int[] arr={233,334,55,44,23,878};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    //for to find min
    static int min(int[] arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }

    //to find maximum

    static int max(int[] arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
