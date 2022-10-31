package com.fastcampus.de.java.clip_13;

import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        System.out.println(zoneId);
        System.out.println(ZoneId.getAvailableZoneIds());//어떤 zone id가 있는 지 확인
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);


        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);
        System.out.println(offsetDateTime);
    }

}
