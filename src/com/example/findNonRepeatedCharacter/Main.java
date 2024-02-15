package com.example.findNonRepeatedCharacter;

import java.util.LinkedHashMap;
import java.util.Map;
//Given a String, find the first non-repeated character in it using Stream functions?
//String input = "Java articles are Awesome";

public class Main {
    public static char findNonRepeatedCharacter(String str) {

        Map<Character,Long> charCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(LinkedHashMap::new,
                        (mymap,chr) -> mymap.put(chr, mymap.containsKey(chr) ? mymap.get(chr) + 1 : 1),LinkedHashMap::putAll);

        return charCount.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findAny()
                .orElseThrow(()-> new RuntimeException("No non-repeating character found!"));
    }

    public static void main(String[] args){
        String string = "Java articles are Awesome";
        System.out.println("First non-repeating character is: "+findNonRepeatedCharacter(string));
    }
}
