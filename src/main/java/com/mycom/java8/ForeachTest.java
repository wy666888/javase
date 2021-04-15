package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class ForeachTest {
    @Test
    void loopMapClassic(){
        Map<String,Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        map.put("D",40);
        map.put("E",50);
        //java8以前循环map的方式
        for (Map.Entry<String,Integer> entry:map.entrySet()
             ) {
            System.out.println( "key:"+entry.getKey()+",value:"+entry.getValue());
        }

    }
    @Test
    void loopMapJava8(){
        Map<String,Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        map.put("D",40);
        map.put("E",50);
        map.put(null,60);
        //java之后循环map的方式
        map.forEach((k, v) -> System.out.println( "key:"+k+",value:"+v));
        System.out.println();
        //过滤key为null
        map.forEach((k, v) -> {
            if(k!=null){
                System.out.println( "key:"+k+",value:"+v);
            }
        });
    }

    @Test
    void loopListClassic(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        for (String s:list
             ) {
            System.out.println(s);
        }
        remove(list);
        System.out.println(list);

    }
    void remove(List list){
        list.remove(0);
    }
    @Test
    void loopListJava8(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(null);

       list.forEach(System.out::println);
        System.out.println();
       list.stream().filter(Objects::nonNull).forEach(System.out::println);
    }
    @Test
    void listTest(){
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(3L);
        list.add(2L);

        Long s = 2L;
        System.out.println(list.contains(s));
        list.stream().sorted((v1,v2)-> BigDecimal.valueOf(v1).compareTo(BigDecimal.valueOf(v2))).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("=====");

        list.stream().sorted((v1,v2)-> BigDecimal.valueOf(v2).compareTo(BigDecimal.valueOf(v1))).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("=====");
        List<Long> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);
        System.out.println("=====");
        list = null;
        System.out.println(list2);


    }
    @Test
    void mapTest(){
        Map<Long,String> map = new HashMap<>();
        map.put(1L,"111");
        map.put(2L,"222");
        map.put(3L,"333");

        //true：key的比较使用的是equals进行的，注意类型的转换操作
        Long s = 2L;
        System.out.println(map.containsKey(s));

        Map<Boolean,String> map2 = new HashMap<>();
        map2.put(true,"111");
        map2.put(false,"222");

        //true：key的比较使用的是equals进行的，注意类型的转换操作
        Boolean flag = true;
        System.out.println(map2.containsKey(flag));

    }
}
