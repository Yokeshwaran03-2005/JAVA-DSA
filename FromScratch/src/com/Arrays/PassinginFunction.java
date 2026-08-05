package com.Arrays;

import java.util.Arrays;

public class PassinginFunction {
    static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


    }
    static void change(int[] arr){
        arr[0]=66;
        arr[1]=77;
        arr[2]=33;
        arr[3]=44;
        arr[4]=55;
    }
}
