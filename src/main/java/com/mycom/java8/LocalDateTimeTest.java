package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class LocalDateTimeTest {

    @Test
    void test01() {
        //获取时间字符串
        String timeStr = "2021-01-05 10:42";
        LocalTime localTime = LocalTime.parse(timeStr.substring(11));
        System.out.println(localTime);

        //2021-01-09T17:07:55+08:00
        timeStr = "2021-01-09T17:07:55+08:00";
        timeStr = timeStr.substring(0,19);
        LocalDateTime successTime = LocalDateTime.parse(timeStr
                , DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
        System.out.println(successTime);

    }

    @Test
    void test02() {
        //获取时间字符串

        //System.out.println(parseInt(String.valueOf(1.0)));
        System.out.println((int) 1.0);
        Double v = 5.5;
        System.out.println(v.intValue());

    }

    @Test
    void test03() {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mmZZZZ");
        System.out.println(zbj);
        System.out.println(formatter.format(zbj));

    }
    @Test
    void test04() {
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));
    }

    }