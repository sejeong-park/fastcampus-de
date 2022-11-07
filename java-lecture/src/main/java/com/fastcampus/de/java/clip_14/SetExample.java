package com.fastcampus.de.java.clip_14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> IntegerSet = new HashSet<>();
        IntegerSet.add(3);
        IntegerSet.add(5);
        IntegerSet.add(2);
        IntegerSet.add(1);
        IntegerSet.add(5);
        System.out.println(IntegerSet);

        Set<String> StringSet = new HashSet<>();
        StringSet.add("LA");
        StringSet.add("New York");
        StringSet.add("Seoul");
        StringSet.add("LasVegas");
        StringSet.add("San Francisco");

        StringSet.remove("Seoul");
        System.out.println(StringSet);

        System.out.println("Exist LA ? " + StringSet.contains("LA"));


        List<String> removeTarget = new ArrayList<>();
        removeTarget.add("LA");
        removeTarget.add("New York");
        StringSet.removeAll(removeTarget); // list 끼리 빼기
        System.out.println(StringSet);
        StringSet.clear();
        System.out.println(StringSet);





    }

}
