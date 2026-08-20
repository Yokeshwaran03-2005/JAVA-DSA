package LeetCode;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
/*852. Peak Index in a Mountain Array

You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

Return the index of the peak element.

Your task is to solve it in O(log(n)) time complexity.



Example 1:

Input: arr = [0,1,0]

Output: 1

Example 2:

Input: arr = [0,2,1,0]

Output: 1

Example 3:

Input: arr = [0,10,5,2]

Output: 1



Constraints:

3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.*/

public class MountainArray {
    static void main() {

    }
        public int peakIndexInMountainArray(int[] arr) {
            int start =0;
            int end=arr.length-1;

            while(start<end){
                int mid=start+(end-start)/2;
                if(arr[mid]>arr[mid+1]){
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

