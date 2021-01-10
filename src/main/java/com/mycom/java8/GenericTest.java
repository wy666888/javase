package com.mycom.java8;

import org.junit.jupiter.api.Test;

/**
 * 泛型类
 *
 *
 * @param <T>
 */
public class GenericTest<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    T play(){
        System.out.println(this.toString());
        return null;
    }
    @Test
    void test(){

        Integer i = 5;
        GenericTest<Integer> intTest = new GenericTest<>();
        intTest.setObj(i);
        Integer b = intTest.getObj();
        intTest.play();
        System.out.println(b);

        System.out.println();


        float i2 = 5;
        GenericTest<Float> floatTest = new GenericTest<>();
        floatTest.setObj(i2);
        float c = floatTest.getObj();
        floatTest.play();
        System.out.println(c);
    }
}
