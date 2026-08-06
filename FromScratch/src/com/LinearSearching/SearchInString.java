package com.LinearSearching;
import java.util.Arrays;

public class SearchInString {
    static void main(String[] args) {
        String name="YOKESH";
        char target='K';
       //System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    // array to String
    static boolean search2(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for (char ch :str.toCharArray()){
            if(ch == target){
                return true;
            }

        }

        return false;
    }



    static boolean search1(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
            return true;
        }
            }

        return false;
    }


    }



