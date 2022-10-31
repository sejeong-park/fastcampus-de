package com.fastcampus.de.java.clip_13;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate initialDate = LocalDate.of(2022,7,10);
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        int five = Period.between(initialDate, finalDate).getDays();
        System.out.println(five);

        System.out.println(ChronoUnit.DAYS.between(initialDate, finalDate));
    }
}
