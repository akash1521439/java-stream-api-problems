package com.example.cubeOnAListAndFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<Integer> cubeAndFilterArrayElements(List<Integer> arr){
        return arr.stream().map(x -> x*x*x).filter(x -> x>50).collect(Collectors.toList());
    }
    public static void main(String[] args){
        List<Integer> myList = Arrays.asList(3,4,15,8,49,25,98,98,32,15);
        System.out.println("List After performing cube and filter: ");
        for (int i:cubeAndFilterArrayElements(myList)){
            System.out.print(i+" ");
        }
    }
}
