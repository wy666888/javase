package com.mycom.java8;

import org.junit.jupiter.api.Test;

/**
 * 泛型类-类型边界，因为会有类型擦除的过程，最终为object，最终限定为使用object类型的
 *想要使用其他类型的话就要设置类型边界的
 *是使用extends进行类型的限制
 *其中T可以是奔雷或者是子类
 *
 * @param <T>
 */
public class GenericExtendsTest<T extends User> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    T play(){
        System.out.println(this.toString());
        System.out.println(obj.getName());
        return null;
    }
    @Test
    void test(){

        User u = new User(1,"zhang");
        GenericExtendsTest<User> intTest = new GenericExtendsTest<>();
        intTest.setObj(u);
        User b = intTest.getObj();
        intTest.play();
        System.out.println(b);

        System.out.println();

    }
    @Test
    void testSub(){

        UserDetail u = new UserDetail(2,"san");
        GenericExtendsTest<UserDetail> intTest = new GenericExtendsTest<>();
        intTest.setObj(u);
        User b = intTest.getObj();
        intTest.play();
        System.out.println(b);

        System.out.println();

    }

    /**
     * 协变：子类能向父类转换 Animal a1=new Cat();
     * 逆变: 父类能向子类转换 Cat a2=(Cat)a1;
     * 不变: 两者均不能转变
     * 对于协变，我们见得最多的就是多态,而逆变常见于强制类型转换。
     */
    @Test
    void arrayError(){
        //数组协变问题：编译可以通过，运行时报错
        //java.lang.ArrayStoreException: java.lang.Double
        Object[] nums = new Integer[3];
        nums[0] = 3.2;
        nums[1] = "string";
        nums[2] = '2';
    }
    @Test
    void equals(){
        //true
        System.out.println(null==null);
    }
}
