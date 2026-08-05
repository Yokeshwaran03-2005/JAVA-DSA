package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // array of primitives
        int[] arr=new int[5];
        arr[0]=33;
        arr[1]=32;
        arr[2]=56;
        arr[3]=90;
        arr[4]=98;
//        System.out.println(arr[3]);

        //input using for loop
//        for(int i=0;i<arr.length;i++){
//            arr[i]=in.nextInt();
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
        System.out.println(Arrays.toString(arr));
        // array of objects
        String[] str=new String[5];
        for(int i=0;i<str.length;i++){
            System.out.print("Enter your string: ");
            str[i] =in.next();
        }
        System.out.println(Arrays.toString(str));









    }

}
