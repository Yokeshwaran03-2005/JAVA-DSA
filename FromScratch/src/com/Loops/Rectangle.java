package com.Loops;

import java.util.Scanner;

public class Rectangle {
    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Lenght of Rectangle: ");
        double lenght= in.nextDouble();
        System.out.print("Enter Width of Rectangle: ");
        double width=in.nextDouble();

        double area=lenght*width;
        System.out.println("Area of rectangle: "+area);
    }
}
