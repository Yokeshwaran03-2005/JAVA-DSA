package com.Methods;

import java.util.Arrays;

public class ChangeValue {
    static void main() {
        int[] arr={22,22,33,44,55,66};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[3]=444; //if you make a change to the object via this ref variable will change to object
    }
}
