package com.kodilla.collections.sets.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class MapExample {

    public static void main(String[] args) {
        String text = "ala ma a kot ma ale";
        List<String> tokens = asList(text.split(" "));
        Map<String, Integer> counts = new HashMap<>();

        for (String token: tokens) {

            if (token.isEmpty()) {
                continue;
            }

//            if (!counts.containsKey(token)) {
//                counts.put(token, 1);
//            } else {
//                int tc = counts.get(token);
//                counts.put(token, tc+1);
//            }

            int count = counts.getOrDefault(token, 0);
            counts.put(token, count+1);
        }

        System.out.println(tokens);
        System.out.println(counts);
    }


//    key    ->   value
//    Object -> Object
//    unique -> non unieque
//    non null -> XNull
//
//    haslo - znaczenie
//    String -> String
//
//    book -> książka
//    pencil -> długopis
//
//
//    Map<String, String> slownik - new HashSet<>();
//
//    zamek -> castle
//    zamek -> lock
//
//    String -> List<String>
//    Map<String, Lis<String>> slownik - new HashSet<>();

}
