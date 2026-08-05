package com.Methods;

import java.util.Scanner;

public class Sum {
    static void main() {
//        int ans =sum2();
//        System.out.println(ans);
        int ans=sum3(5,5);
        System.out.println(ans);

    }
    // pass the value of nmber whean you are calling the method in main(
    static int sum3(int a,int b){
        int sum=a*b;
        return sum;

    }
    //return the value
    static int sum2(){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int num1=in.nextInt();
        System.out.println("Enter the Number 2: ");
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;

    }
   static void sum(){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the Number 1: ");
        int num1=in.nextInt();
        System.out.println("Enter the Number 2: ");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("The sum = "+sum);
    }
    /*
     return type name(){
        // body
       return statement;
     }*/
}
