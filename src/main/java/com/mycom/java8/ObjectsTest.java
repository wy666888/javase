package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.util.Objects;

public class ObjectsTest {

    @Test
    void equals(){
        System.out.println(Objects.equals(1,2));
        System.out.println(Objects.equals(1,1));
        System.out.println(Objects.equals(null,null));

    }
}
