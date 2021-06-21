package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @description：TODO
 * @author：flab1 2021/04/19/ 13:54
 */
public class TimeTest {

    @Test
    void durationTest(){
        Duration duration =Duration.ofMinutes(5);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("修改之前");
        System.out.println("now = " + now);
        System.out.println("修改之后");
        System.out.println("返回 = " + now.minus(duration));
        System.out.println("now = " + now);
    }

}
