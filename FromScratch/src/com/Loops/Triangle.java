package com.Loops;

import java.util.Scanner;

public class Triangle {
    static void main() {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the Base Of Traingle: ");
        double base= in.nextDouble();
        System.out.println("Enter the Height of Traingle: ");
        double side=in.nextDouble();

//        double area=(base*Height)/2;
//        System.out.println("Area of Traingle: "+area);
//
        double height = Math.sqrt((side * side) - ((base * base) / 4));

        double area = (base * height) / 2;

        System.out.println("Area of Isosceles Triangle = " + area);
    }
}
