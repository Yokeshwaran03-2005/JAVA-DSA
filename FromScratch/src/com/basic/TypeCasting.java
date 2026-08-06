package com.basic;

import java.util.Scanner;

public class TypeCasting {
    static void main() {
        Scanner input = new Scanner(System.in);

        // type casting
        int num = (int) (45.78f);
        System.out.println(num);

        // automatic type promotion in expression}

        byte a=40;
        byte b=50;
        byte c=100;
        int d=(a*b)/c;

        System.out.println(d);
    }
}