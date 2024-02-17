package com.example.countWordFromStringArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//How to count each element/word from the String ArrayList in Java8?
public class Main {
    public static Map<String, Long> countWord(List<String> stringList){
       return stringList.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
    }
    public static void main(String[] args){
        List<String> stringList = Arrays.asList("ak","bb","mk","ak","cm","mk");

        countWord(stringList).forEach((key,value)-> System.out.println(key+": "+value));
    }
}
