package LeetCode;

public class FloorOfNumber {
    static void main() {
        int[] arr ={2,3,5,9,14,16,18};
        int target=1;
        int ans=floor(arr,target);
        System.out.println(ans);



    }
//it's return the index smallest elemnts in the array <=target;
    static int floor(int[] arr, double target) {
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
        return end;
    }
}