package BinarySearching;

public class binarysearch {
    static void main(String[] args) {
        int[] arr={11,22,33,44,55,66,77,88,89,90};
        int target=88;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    //retrun the index
    //to fing the middle elemnts
    static int binarySearch(int[]arr,int target){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
          int  mid=low+(high-low)/2;
          // this to find the target elemnts
          if(target<arr[mid]){
              high=mid-1;
          } else if (target>arr[mid]) {
              low=mid+1;
          }else {
              //this will return my answer
              return mid;
          }

        }
        return -1;
    }
}
