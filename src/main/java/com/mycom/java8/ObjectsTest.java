package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.util.Objects;

public class ObjectsTest {

    @Test
    void equals(){
        System.out.println(Objects.equals(1,2));
        System.out.println(Objects.equals(1,1));
        System.out.println(Objects.equals(null,null));
        System.out.println(Objects.equals(Integer.valueOf("1"),1));

    }
    @Test
    void booleanEquals() {
        Boolean flag = null;

        System.out.println(Objects.equals(flag,true)?"是":"否");
    }

    }
