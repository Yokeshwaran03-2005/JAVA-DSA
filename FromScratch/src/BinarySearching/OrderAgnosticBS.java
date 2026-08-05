package BinarySearching;

public class OrderAgnosticBS {
    static void main(String[] args) {
        int []arr ={-18,-12,-4,0,2,3,4,15,16,18,22,45,89}; //ascending
        int[]arr1={99,80,75,22,11,10,5,2,-3};//desecding
        int target=22;
        int ans=orderAgonisticBS(arr1,target);
        System.out.println(ans);

    }

    static int orderAgonisticBS(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        // find the wheter array is sorted Ascending or descending
        boolean isAsc;
        isAsc = arr[low] < arr[high];


        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    high = mid - 1;
                } else  {
                    low = mid + 1;
                }
            }else {
                if (target >arr[mid]) {
                    high = mid - 1;
                } else  {
                    low = mid + 1;
                }
            }
        }
        return low;
    }
}







