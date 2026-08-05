package com.Loops;

import java.util.Scanner;

public class Fibonacci {
    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the series number:");
        int n=in.nextInt();
        int a= 0;
        int b=1;
        int count =2;
        while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);


    }
}
/* 0 ,1 , 0+1=1;
1+1=2 ; 0,1,1,2
2+1=3 ;0,1,1,2,3,
3+2=5 ;0,1,1,2,3,5
5+3=8 ;0,1,1,2,3,5,8
8+5=13;0,1,1,2,3,5,8,13
13+8=21;0,1,1,2,3,5,8,13,21
 */