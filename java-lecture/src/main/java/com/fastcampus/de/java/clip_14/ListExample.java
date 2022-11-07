package com.fastcampus.de.java.clip_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(11);
        list.add(5);
        list.add(4);
        list.add(41);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        System.out.println("size " + list.size());

        list.remove(4);
        System.out.println(list);

        int[] intArray = {1,5,4,11,14};

        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        for (int cur: list) {
            System.out.println(cur);
        }


    }
}
