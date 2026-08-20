package LeetCode;
//amazon Qestion
public class InfinityArray {
   public static void main(String[]args) {
        int arr[]={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr,target));

    }

    static int ans(int arr[],int target){
        //first find the range
        //forst start with box of 2
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1; //this is my new start
            //double the box value
            //end = previous end+size of box *2
            end=end+(end-start + 1) * 2;
            start=temp;

        }

        return binarySearch(arr,target ,start, end);
    }
    static int binarySearch(int[]arr, int target,int start, int end){

        while(start<=end){
            int  mid=start+(end-start)/2;

            // this to find the target elemnts
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else {
                //this will return my answer
                return mid;
            }

        }
        return -1;
    }
}

