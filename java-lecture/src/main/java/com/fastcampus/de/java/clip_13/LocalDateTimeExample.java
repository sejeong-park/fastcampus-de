package com.fastcampus.de.java.clip_13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(2022, Month.NOVEMBER, 20, 6, 30));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.plusDays(1));


    }
}
