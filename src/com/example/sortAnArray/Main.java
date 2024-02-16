package com.example.sortAnArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<Integer> sortList(List<Integer> arr){
        return arr.stream().sorted().collect(Collectors.toList());
    }
    public static void main(String[] args){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println("Sorted array: ");
        for (int i:sortList(myList)){
            System.out.print(i+" ");
        }
    }
}
