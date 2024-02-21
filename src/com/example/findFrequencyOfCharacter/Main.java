package com.example.findFrequencyOfCharacter;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static Map<String,Long> findFrequency(String string){
       return Arrays.stream(string.split("")).collect(groupingBy(Function.identity(),counting()));
    }
    public static void main (String[] args){
        String string = "programming";
        findFrequency(string).entrySet().forEach(System.out::println);
        //System.out.println(findFrequency(string));
    }
}
