package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    void empty(){
        Optional<String> ceshi = Optional.empty();
        //true
        System.out.println(ceshi.isEmpty());
        //false
        System.out.println(ceshi.isPresent());
        //不输出
        //如果存在值，则使用值执行给定操作，否则不执行任何操作。
        //传入consumer
        //void ifPresent​(Consumer<? super T> action) 如果存在值，则使用值执行给定操作，否则不执行任何操作
        ceshi.ifPresent(v->System.out.println(111));
        //如果存在值，则返回该值，否则抛出 NoSuchElementException
        //java.util.NoSuchElementException: No value present
        //System.out.println(ceshi.get());

        System.out.println(1111);
        System.out.println();

        //直接报错（返回一个 Optional描述给定的非 null值），改进就使用ofNullable
        //NullPointerException
        //ceshi = Optional.of(null);
        //返回描述给定值的 Optional ，如果 null ，否则返回空 Optional 。
        ceshi = Optional.ofNullable(null);
        //true
        System.out.println(ceshi.isEmpty());
        //false
        System.out.println(ceshi.isPresent());
        //T orElse​(T other) 如果存在值，则返回该值，否则返回 other
        System.out.println(ceshi.orElse("notnull"));
        //T orElseGet​(Supplier<? extends T> supplier) 如果存在值，则返回该值，否则返回由供应函数生成的结果
        System.out.println(ceshi.orElseGet(()->"supplynotnull"));
        //不输出
        ceshi.ifPresent(v->System.out.println(111));
        //java.util.NoSuchElementException: No value present
        //System.out.println(ceshi.get());
        System.out.println(222);
        System.out.println();

        //空字符串也不是空
        ceshi = Optional.ofNullable("");
        //true
        System.out.println(ceshi.isEmpty());
        //false
        System.out.println(ceshi.isPresent());
        //不输出
        ceshi.ifPresent(v->System.out.println(111));
        System.out.println(ceshi.get());

        System.out.println(333);
        System.out.println();

        //非空
        ceshi = Optional.ofNullable("str");
        //true
        System.out.println(ceshi.isEmpty());
        //false
        System.out.println(ceshi.isPresent());
        System.out.println(ceshi.get());
        //不输出
        ceshi.ifPresent(v->System.out.println(111));
        System.out.println();

        //非空
        ceshi.orElse("str1");
        //true
        System.out.println(ceshi.isEmpty());
        //false
        System.out.println(ceshi.isPresent());
        System.out.println(ceshi.get());
        //不输出
        ceshi.ifPresent(v->System.out.println(111));
        System.out.println();


    }
}
