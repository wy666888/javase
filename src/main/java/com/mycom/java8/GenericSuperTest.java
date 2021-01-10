package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型类
 *
 *
 * @param <T>
 */
public class GenericSuperTest<T> {
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

    /**
     * <? super Fruit>表示传入的泛型具体类型必须是Fruit的父类，那么我们可以确定只要元素是Fruit以及能转型为Fruit的，一定能向上转型为对应的此类型,比如：
     * @param list
     */
    void playCard(List<? super UserDetail> list){
        //泛型参数
        //可以是本类或者是其子类
        list.add(new UserDetail(1,"zhang"));
        list.add(new UserDetail(2,"san"));
        list.add(new UserDetail(3,"li"));

        list.forEach(u->System.out.println(111111));
        //list.forEach(u->System.out.println(u.getId()+","+u.getName()));
    }
    @Test
    void test(){

        Integer i = 5;
        GenericSuperTest<Integer> intTest = new GenericSuperTest<>();
        intTest.setObj(i);
        Integer b = intTest.getObj();
        intTest.play();
        System.out.println(b);

        System.out.println();


        float i2 = 5;
        GenericSuperTest<Float> floatTest = new GenericSuperTest<>();
        floatTest.setObj(i2);
        float c = floatTest.getObj();
        floatTest.play();
        System.out.println(c);
    }
    @Test
    void playCard(){
        playCard(new ArrayList<>());
    }
}
