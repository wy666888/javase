package com.mycom.java8;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {

    @Test
    void filter() {
        //使用filter进行数据过滤操作
        //System.out.println( "Hello World111!");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filters = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        System.out.println(filters);

    }

    @Test
    void forEach() {
        //使用forEach进行循环遍历操作
        //System.out.println( "Hello World111!");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        strings.stream().forEach(System.out::println);
        System.out.println();
        List<String> filters = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        System.out.println(filters);
        System.out.println();

        //对于forEach，空的集合也是可以处理的，没有问题
        System.out.println("==begin==");
        strings = Collections.emptyList();
        strings.stream().forEach(System.out::println);
        System.out.println("==结束==");
        //NPE
        //System.out.println(String.valueOf(null));


        System.out.println("==结束==");


        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
        System.out.println();
        random.ints().limit(10).forEach(s -> System.out.println(s + "11111"));

    }

    @Test
    void map() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squareList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(squareList);

    }

    @Test
    void collect() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers = new ArrayList<>();
        //为null时使用stream直接NPE
        //numbers = null;
        // 获取对应的平方数
        List<Integer> squareList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(squareList);
        System.out.println(List.of());


    }
}
