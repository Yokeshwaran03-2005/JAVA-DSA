package com.Methods;

import java.util.Scanner;

public class AramstrongNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your AramStrong Number: ");
        int num= sc.nextInt();

            int original = num;
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                sum = sum + (rem * rem * rem);
                num /= 10;
            }


            if (sum == original) {
                System.out.println(" The Given Number is the aramstrong number");
            } else {
                System.out.println("The Given Number is Not AramStrong Number");
            }


                }
        }


