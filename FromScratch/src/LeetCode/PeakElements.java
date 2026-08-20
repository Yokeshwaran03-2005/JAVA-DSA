package LeetCode;
//162. Find Peak Element
//https://leetcode.com/problems/find-peak-element/
/*A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.



Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.


Constraints:

1 <= nums.length <= 1000
-231 <= nums[i] <= 231 - 1
nums[i] != nums[i + 1] for all valid i.*/

//smae copy of Mountain Array
public class PeakElements {
    static void main() {

    }
    class Solution {
        public int findPeakElement(int[] nums) {
            int start =0;
            int end=nums.length-1;

            while(start<end){
                int mid=start+(end-start)/2;
                if(nums[mid]>nums[mid+1]){
                    //you are in dec part of an array
                    //this may be the ans that look at first
                    //this why end!=mid-1;
                    end=mid;
                }else{
                    //now i am asc part of the arr
                    start=mid+1;//because we known that mid+1 element>mid elements
                }
            }
            //in the end start==end and pointing to the largest number because of the 2 check
            //start and end always trying to check the max elements in the above 2 checks
            //hence whean the pointing to just one elemts,that is is max one,because that is what check says
            //more elobaration:at the every part of time start+end they have best possible ans till that time and if we saying only one item remaing hence because of above line that is best posiible ans.

            return end;//or will give return start; bcz both are eqal at the end
        }
    }
}
