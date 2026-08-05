package com.Loops;

import java.util.Scanner;

public class Largest {
    static void main() {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        //Q:find the Largest of the 3 number
        int max =a;
        if(b>max){
            max=b;
        }
        if(c >max){
            max=c;
        }
        System.out.println(max);


    }
}
