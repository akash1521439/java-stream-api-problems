package com.example.findFirstRepeatedCharater;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static char findFirstRepeatedCharacter(String str) {

        Map<Character,Long> charCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(LinkedHashMap::new,
                        (mymap,chr) -> mymap.put(chr, mymap.containsKey(chr) ? mymap.get(chr) + 1 : 1),LinkedHashMap::putAll);

        return charCount.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("No repeating character found!"));
    }

    public static void main(String[] args){
        String string = "Java articles are Awesome";
        System.out.println("First repeating character is: "+findFirstRepeatedCharacter(string));
    }
}
