package com.Loops;

import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner in=new Scanner(System.in);
        //take input from user does not press Xor x
        int ans =0;
        while (true){
            System.out.print("Enter the Operator:");
            char op=in.next().trim().charAt(0);
            System.out.println();
            if(op =='+' || op == '-' || op== '/' || op== '*'){
                System.out.print("Enter two number: ");
                int num1  = in.nextInt();
                int num2 = in.nextInt();


                if(op=='+'){
                    ans=num1+num2;
                }
                if(op=='_'){
                    ans=num1-num2;

                }
                if(op=='/'){
                    if(num2 !=0){
                        ans =num1 %num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }
                if(op == '*') {
                    ans =num1*num2;
                }
                }else if (op=='x' || op=='X') {
                    break;
                }else{
                    System.out.println("Invalid operation!!!");
                }
            System.out.println(ans);
            }


        }

    }

