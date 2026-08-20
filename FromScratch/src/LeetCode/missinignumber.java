package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    static void main(String[] args) {
        int[]nums={4,0,2,1};

        System.out.println(missingNumber(nums));

    }
      static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length&& nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //search for a missing  elements
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;



    }
    static void swap(int[] nums, int start, int End){
        int temp=nums[start];
        nums[start]=nums[End];
        nums[End]=temp;
    }

}
