package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型类-类型边界，因为会有类型擦除的过程，最终为object，最终限定为使用object类型的
 *想要使用其他类型的话就要设置类型边界的
 *是使用extends进行类型的限制
 *
 * @param <T>
 */
public class GenericWildcardExtendsTest<T extends User> {
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
    void playCard(List<? extends User> list){
        //泛型参数
        //可以是本类或者是其子类
        list.forEach(u->System.out.println(u.getId()+","+u.getName()));
    }
    @Test
    void test(){

        User u = new User(1,"zhang");
        GenericWildcardExtendsTest<User> intTest = new GenericWildcardExtendsTest<>();
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
    @Test
    void playCard(){
        List<User> list = new ArrayList<>();
        list.add(new User(1,"zhang"));
        list.add(new User(2,"san"));
        list.add(new User(3,"li"));
        playCard(list);
    }
    @Test
    void playCardSub(){
        List<UserDetail> list = new ArrayList<>();
        list.add(new UserDetail(1,"zhang"));
        list.add(new UserDetail(2,"san"));
        list.add(new UserDetail(3,"li"));
        playCard(list);
    }
}
