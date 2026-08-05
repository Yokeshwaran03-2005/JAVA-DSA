package com.Loops;

public class CountNums {
    static void main() {
        int n= 444555;
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==4){
                count++;
            }
            n=n/10;

        }
        System.out.println(count);

    }
}
