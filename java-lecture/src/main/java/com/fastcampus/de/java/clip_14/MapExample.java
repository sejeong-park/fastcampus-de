package com.fastcampus.de.java.clip_14;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "cherry");
        map.put(3, "honey");
        System.out.println(map);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("first", "apple");
        stringMap.put("second", "cherry");
//        stringMap.put("third", "honey");

        stringMap.putIfAbsent("second", "pineapple");
        stringMap.putIfAbsent("third", "pineapple");

        System.out.println(stringMap);

        System.out.println(stringMap.containsKey("first"));
        if (stringMap.containsKey("first")){
            System.out.println(stringMap.get("first"));
        }

        if (! stringMap.containsKey("fourth")){
            System.out.println("doesn't exist!!");
        }


        for (String key: stringMap.keySet()) {
            System.out.println(stringMap.get(key));
        }
        System.out.println(stringMap.values());

    }
}
