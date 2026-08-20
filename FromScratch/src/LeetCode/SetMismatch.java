package LeetCode;
//microsoft
//https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int i=0;
            while(i<nums.length){
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }else{
                    i++;
                }
            }
            //find the missing
            for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                    return new int[]{nums[index],index+1};
                }
            }
            return new int[]{-1,-1};

        }

        static void swap(int []nums,int s,int e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
        }
    }
}
