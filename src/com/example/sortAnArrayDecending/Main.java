package com.example.sortAnArrayDecending;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//Given a list of integers, sort all the values present in it in descending order using Stream functions?
public class Main {
    public static List<Integer> sortList(List<Integer> arr){
        return arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
    public static void main(String[] args){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println("Sorted array: ");
        for (int i:sortList(myList)){
            System.out.print(i+" ");
        }
    }
}
