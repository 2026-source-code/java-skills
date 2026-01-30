package ex03;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeEx02 {
    public static void main(String[] args) {
        // 1. 로컬 데이트 타임 (벽시계 - 문자열로 박힌 시계)
        LocalDateTime now1 = LocalDateTime.now();

        // 년 월 일
        System.out.println("Year : " + now1.getYear());
        System.out.println("Month : " + now1.getMonth());
        System.out.println("DayOfMonth : " + now1.getDayOfMonth());
        System.out.println("DayOfWeek : " + now1.getDayOfWeek());
        System.out.println("DayOfYear : " + now1.getDayOfYear());

        System.out.println("=======================");

        System.out.println("Hour : " + now1.getHour());
        System.out.println("Min : " + now1.getMinute());
        System.out.println("Second : " + now1.getSecond());

        System.out.println("=======================");

        System.out.println(now1.plusDays(2));
        System.out.println(now1.plusHours(9));


        //2026-01-30T15:43:11.740733800
        //2026-01-30T06:43:11.740733800Z

    }
}
