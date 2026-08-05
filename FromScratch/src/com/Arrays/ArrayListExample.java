package com.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //syntax

       ArrayList<Integer> list=new ArrayList<>(10);
//        list.add(22);
//        list.add(88);
//        list.add(223);
//        list.add(883);
//        list.add(221);
//        list.add(881);
//        list.add(222);
//        list.add(8833);
//        System.out.print(list.contains(223));
//        System.out.print(list);
//        list.set(4,777);
//        System.out.print(list);
//        list.remove(7);
//        System.out.print(list);

        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        //get items at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);







    }
}
