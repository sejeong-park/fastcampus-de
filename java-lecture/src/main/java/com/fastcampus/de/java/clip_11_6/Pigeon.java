package com.fastcampus.de.java.clip_11_6;

public class Pigeon extends Bird{

    @Override
    boolean flyable(int z) {
        return z < 10000;
    }
}
