package com.Loops;

public class Conditional {
    /*Syntax of IF statement
          if(bollean expression Tor F){
          // body }
          else{
          //do this
          }
     */
    static void main() {
        int salary=80000;
        if(salary>50000){
            salary=salary+5000;
        }else{
            salary=salary+1000;
        }
        System.out.println(salary);
    }



}
