package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter your ArrayList = ");
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();

        //intilization
        for(int i=0;i<5;i++){
            list.add(new ArrayList<>());
        }
        //add elelments
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.print(list);

    }
}
