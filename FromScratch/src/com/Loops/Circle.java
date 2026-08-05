package com.Loops;

import java.util.Scanner;

public class Circle {
    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double radius=in.nextDouble();
        double area=Math.PI * radius *radius;
        System.out.println("Radius of Circle "+ area);


    }
}
