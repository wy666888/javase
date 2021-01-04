package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.util.*;

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
}
