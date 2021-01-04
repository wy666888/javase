package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    @Test
    void accept(){
        //基本使用
        Consumer<String> print = s -> System.out.println(s);
        print.accept("java");

        System.out.println();

        //作为参数传递使用1
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> consumer = s -> System.out.println(s);
        forEach(list,consumer);

        System.out.println();

        //作为参数传递使用2
        List<String> list2 = Arrays.asList("a","ab","abc");
        Consumer<String> consumer2 = s -> System.out.println(s.length());
        forEach(list2,consumer2);
    }

    private <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list
        ) {
            consumer.accept(t);
        }
    }
    @Test
    void andThen(){
        //对于一个对象执行多个操作
        String[] strArr = {"111,男","222,女","333,男"};
        printInfo(strArr,(s)->{System.out.print("姓名："+s.split(",")[0]+"，");},(s)->{System.out.println("性别："+s.split(",")[1]);});
    }

    private void printInfo(String[] strArr, Consumer<String> con1, Consumer<String> con2) {
        for (String s : strArr
        ) {

            con1.andThen(con2).accept(s);
        }
    }
}
