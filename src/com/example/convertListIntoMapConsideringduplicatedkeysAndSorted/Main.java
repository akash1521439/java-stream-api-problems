package com.example.convertListIntoMapConsideringduplicatedkeysAndSorted;

import java.util.*;
import java.util.stream.Collectors;
//How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
public class Main {
    static Map<String, List<Notes>> convert(List<Notes> list){
        Map<String, List<Notes>> sortedMap = list.stream()
                .collect(Collectors.groupingBy(Notes::getTitle,
                        TreeMap::new,
                        Collectors.toList()));
        return  sortedMap;
    }
    public static void main(String[] args){
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 32));
        noteLst.add(new Notes(4, "note4", 34));
        noteLst.add(new Notes(5, "note5", 42));
        noteLst.add(new Notes(6, "note6", 52));

        convert(noteLst).forEach( (key,value)-> System.out.println(key+" "+value));
    }
}
