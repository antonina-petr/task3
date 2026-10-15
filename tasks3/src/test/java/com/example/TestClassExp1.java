package com.example;

import java.util.ArrayList;
import java.util.List;

public class TestClassExp1 {

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    public static List<String> removeSpecificName (List<String> list, String nameToRemove){
        List<String> newlist = new ArrayList<>();

        for (String name : list){
            if (name.equals(nameToRemove) ){
                continue;
            }
            newlist.add(name);
        }
        return newlist;
    }

    public static String checkAccess(int age){
        if (age > 18){
            return "Allowed";
        }
        else {
            return "Denied";
        }
    }

    public static boolean isPositive(int n){
        return n > 0 ? true : false;
    }



}
