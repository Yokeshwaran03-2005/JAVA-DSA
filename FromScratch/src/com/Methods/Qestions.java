package com.Methods;

import java.util.Scanner;

public class Qestions {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("HEllo Yokesh Welcome To Java World");
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();

        boolean ans=isprime(n);
        System.out.println("The Value Of Current Output is: "+ ans );

    }

    static boolean isprime(int n){
        if(n <=1){
            return false;
        }
        int c=2;
        while(c*c <=n){
            if(n%c==0){
                return false;
            }
            c++;

        }
        if(c*c>n){
            return true;
        }
        return false;
    }
}
