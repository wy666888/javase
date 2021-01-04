package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class PictureConditionTest {
    @Test
    void check1(PictureCondition pc) {
        //非空判断
        //jdk1.8之前是这么写的
        if (pc == null || pc.getUrl() == null || "".equals(pc.getUrl().trim())) {
            throw new RuntimeException("出错啦");
        }
    }

    @Test
    void check2(PictureCondition pc) {
        //如果存在值，则返回该值，否则抛出 NoSuchElementException 。
        Optional.ofNullable(pc).map(PictureCondition::getUrl).map(String::trim).filter(s -> !"".equals(s)).orElseThrow(() -> new RuntimeException("出错了"));
    }
}
