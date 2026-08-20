package LeetCode;
//https://leetcode.com/problems/find-in-mountain-array/description/


public class SearchInMountain {
   public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=5;
        int ans=search(arr,target);
        System.out.println(ans);
    }

     static int search(int[] arr, int target){
        int peak=findPeakElement(arr);
        int firstTry=orderAgonisticBS(arr,target,0,peak);
        if(firstTry !=-1){
            return firstTry;
        }
        return orderAgonisticBS(arr,target,0,arr.length-1);
    }


    static int findPeakElement(int[] arr ) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in dec part of an array
                //this may be the ans that look at first
                //this why end!=mid-1;
                end = mid;
            } else {
                //now i am asc part of the arr
                start = mid + 1;//because we known that mid+1 element>mid elements
            }
        }
        //in the end start==end and pointing to the largest number because of the 2 check
        //start and end always trying to check the max elements in the above 2 checks
        //hence whean the pointing to just one elemts,that is is max one,because that is what check says
        //more elobaration:at the every part of time start+end they have best possible ans till that time and if we saying only one item remaing hence because of above line that is best posiible ans.

        return end;//or will give return start; bcz both are eqal at the end
    }

    static int orderAgonisticBS(int[] arr, int target,int start,int end) {

        // find the wheter array is sorted Ascending or descending
        boolean isAsc;
        isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }else {
                if (target >arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
        }
        return start;
    }
}