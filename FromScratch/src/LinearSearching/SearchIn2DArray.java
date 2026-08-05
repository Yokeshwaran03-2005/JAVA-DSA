package LinearSearching;
import java.util.Arrays;
public class SearchIn2DArray {
    static void main(String[] args) {
        int[][] arr= {
                {22,44,55},
                {44,55,77,88},
                {66,66,88,99},
                {43,65,78,33}
        };
        int target=33;
        int[] ans=search(arr,target); //format for return values
        System.out.println(Arrays.toString(ans));
        System.out.println("The maximum array is : " + max(arr));


    }
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

//max in 2D array
    static int max(int[][] arr){
        int max=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] >max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }



}
