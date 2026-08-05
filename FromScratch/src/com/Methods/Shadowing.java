package com.Methods;

public class Shadowing {
    static String X = "HEllo My Name Is Yokesh"; // this will be shadowed at line 9

    static void main() {
        System.out.println(X);//90
        int X = 40;// the class variable at line 4 is shadowed by this
        System.out.println(X);
        fun();
    }
    static void fun(){
        System.out.println(X);
    }
}
