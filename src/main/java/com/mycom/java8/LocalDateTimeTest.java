package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class LocalDateTimeTest {

    @Test
    void equals(){
        //获取时间字符串
        String timeStr = "2021-01-05 10:42";
        LocalTime localTime = LocalTime.parse(timeStr.substring(11));
        System.out.println(localTime);

    }
    @Test
    void test11(){
        //获取时间字符串

        //System.out.println(parseInt(String.valueOf(1.0)));
        System.out.println((int)1.0);
        Double v = 5.5;
        System.out.println(v.intValue());

    }
}
