package LeetCode;
//https://leetcode.com/problems/first-missing-positive/
//google miscrosoft

public class FirstMissingPositive {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            int i=0;
            while(i<nums.length){
                int correct=nums[i]-1;
                if(nums[i]>0&&nums[i]<nums.length&&nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }else{
                    i++;
                }
            }
            //search for first missing number

            for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                    return index+1;
                }
            }
            //case 2
            return nums.length+1;

        }

        static void swap(int [] nums,int s,int e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
        }
    }
}
