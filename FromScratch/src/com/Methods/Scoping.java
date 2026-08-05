package com.Methods;

import java.security.spec.RSAOtherPrimeInfo;

public class Scoping {
    static void main() {
        int a= 10;
        int b=33;
        String name="Yokesh";


        {
            int c=333;
            a=33;
            b=44;
            name="Changed my user";
            System.out.println(name);
            System.out.println("B value changed by user: "+b);

        }

    }
    //scope basically add inside the functional only



    }

