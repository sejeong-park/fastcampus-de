package com.fastcampus.de.java.clip_13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(LocalDate.of(2022,2,20));
        System.out.println(LocalDate.parse("2022-03-23"));

        LocalDate tomorrrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrrow);

        LocalDate prerviousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(prerviousMonthSameDay);

        DayOfWeek sunday = LocalDate.now().getDayOfWeek();
        System.out.println(sunday);

        int twelve = LocalDate.parse("2022-06-12").getDayOfMonth();
        System.out.println(twelve);

        System.out.println(LocalDate.now().isLeapYear());       // 올해가 윤년인지 여부 파악
        System.out.println(LocalDate.parse("2024-01-01").isLeapYear()); //2024년이 윤년인지 여부 확인

        System.out.println(LocalDate.parse("2022-06-11").isAfter(LocalDate.parse("2022-06-12")));


        LocalDateTime begginingOfDay = LocalDate.parse("2022-06-12").atStartOfDay();
        System.out.println(begginingOfDay);
        LocalDate firstDayOfMonth = LocalDate.parse("2022-06-12").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);




    }

}
