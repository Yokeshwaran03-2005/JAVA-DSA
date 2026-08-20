package LeetCode;

public class CelingOfNumber {
    public static void main(String[] yokesh) {
        int[] arr ={2,3,5,9,14,16,18};
        int target=15;
        int ans=ceiling(arr,target);
        System.out.println(arr  [ans]);

    }
// it's return the index smallest elemnts in the array >=target;
    static int ceiling(int[] arr, int target) {
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // this to find the target elemnts
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //this will return my answer
                return mid;
            }

        }
        return start;

    }
}