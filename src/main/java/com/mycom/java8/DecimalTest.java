package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DecimalTest {

    @Test
    void converse() {
        //测试数字的转换和计算
        double d1 = 1.0;
        double d2 = 2.0;
        double d3 = 3.0;
        double d5 = 5;
        int i1 = 6;

        double sum = d1+d2;
        BigDecimal b1 = BigDecimal.valueOf(sum);
        System.out.println(b1);
        int flag = b1.add(BigDecimal.valueOf(d3)).compareTo(BigDecimal.valueOf(i1));
        System.out.println(flag);

    }

    @Test
    void forTest() {
        //for嵌套if的处理流程，continue是可以使用的
        List<String> list = List.of("jimmy", "amy", "simmy");
        List<String> list2 = new ArrayList<>();
        for (String s : list
        ) {
            if (Objects.equals(s, "amy")) {
                continue;
            }
            list2.add(s);
        }
        System.out.println(list2);

    }
    }
