package com.BinarySearching;

import java.util.Arrays;


public class Sortedmatrix {
    static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,9)));

    }
    //seaarch in row provided between the  column provided

    static int[] binarysearch(int[][]matrix,int row,int cstart,int cEnd,int target){
        while(cstart<=cEnd){
            int mid=cstart+(cEnd-cstart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cstart =mid+1;
            }else{
                cEnd =mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;//matrix may be empty
        if(rows==1){
          return binarysearch(matrix,0,0,cols-1,target);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid = cols /2;

        //run thr loop till 2 rows are remaing

        while(rStart <(rEnd-1)){ //while this is true it will have more than
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart =mid;
            }else{
                rEnd =mid;
            }
        }
        //now we have two rows
        //check wheater the tareget is in col of 2 rows

        if(matrix[rStart][cMid] ==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }
        //search in first half
        if(target <= matrix[rStart][cMid -1]){
            return binarysearch(matrix,rStart,0,cMid-1,target);

        }
        //search in second half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols - 1]){
            return binarysearch(matrix,rStart,cMid+1,cols-1,target);

        }
        //search in third half
        if(target <=matrix[rStart+1][cMid-1]){
            return binarysearch(matrix,rStart+1,0,cMid-1,target);

        }else{
            return binarysearch(matrix,rStart+1,cMid+1,cols-1,target);
        }




    }


}
