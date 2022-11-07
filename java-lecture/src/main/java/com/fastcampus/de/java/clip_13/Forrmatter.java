package com.fastcampus.de.java.clip_13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Forrmatter {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2022, Month.OCTOBER, 31, 10, 30);
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE));

        System.out.println(localDateTime.format(
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.KOREA)
        ));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
    }
}
