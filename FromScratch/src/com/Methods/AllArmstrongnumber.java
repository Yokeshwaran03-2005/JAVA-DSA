package com.Methods;

public class AllArmstrongnumber {
    static void main() {
        int i;
        for(i=100; i<=1000; i++){
            int num=i;
            int sum=0;
            while(num>0){
                int rem =num%10;
                num /=10;
                sum=sum+(rem*rem*rem);
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
