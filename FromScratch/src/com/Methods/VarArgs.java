package com.Methods;

import java.util.Arrays;

public class VarArgs {


    static void main() {
fun(99,33,22,444,666,777,88888,9990,88,88,555,33);
        multiple(22,33,"Yokeshwaran","Cristino Ronaldo","Cristino JR");
    }
    static void multiple(int a,int b,String ...v){
        System.out.println("The Output is : "+ Arrays.toString(v));


    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
