package com.example.findMaximumValue;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find the maximum value element present in it using Stream functions?
//List ll=new Array list(10,15,8,49,25,98,98,32,15);
public class Main {
    public static int findMaximum(List<Integer> arr){
        return arr.stream().max(Integer::compare).orElseThrow();
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println("The maximum value is "+Main.findMaximum(list));
    }
}
