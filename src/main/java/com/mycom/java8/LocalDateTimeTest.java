package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalDateTimeTest {

    @Test
    void equals(){
        //获取时间字符串
        String timeStr = "2021-01-05 10:42";
        LocalTime localTime = LocalTime.parse(timeStr.substring(11));
        System.out.println(localTime);

    }
}
