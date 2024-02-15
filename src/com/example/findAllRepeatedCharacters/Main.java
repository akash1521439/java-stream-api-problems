package com.example.findAllRepeatedCharacters;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static List<Character> findAllNonRepeatedCharacter(String str) {

        Map<Character,Long> charCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(LinkedHashMap::new,
                        (mymap,chr) -> mymap.put(chr, mymap.containsKey(chr) ? mymap.get(chr) + 1 : 1),LinkedHashMap::putAll);

        return charCount.entrySet().stream().filter(entry -> (entry.getValue() > 1 && entry.getKey() != ' ') )
                .map(Map.Entry::getKey)
                .toList();
    }

    public static void main(String[] args){
        String string = "Java articles are Awesome";
        System.out.println("First non-repeating character is: "+findAllNonRepeatedCharacter(string));
    }
}
