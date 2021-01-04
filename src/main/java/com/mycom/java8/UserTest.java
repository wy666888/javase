package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class UserTest {

    @Test
        void optional(){
        //存在则返回
        User king = new User(1,"King");
        Optional<User> userOpt = Optional.of(king);
        User user = userOpt.orElse(null);
        System.out.println( user.getName());

        //不存在提供默认值
        User user2 = null;
        Optional<User> userOpt2 = Optional.ofNullable(user2);
        User user3 = userOpt2.orElse(new User(111,"zhangsan"));
        System.out.println( user3.getName());

        //通过方法提供值
        User user4 = userOpt2.orElseGet(()->new User(222,"lisi"));
        System.out.println( user4.getName());

        //使用map获取关联数据
        System.out.println( userOpt.map(u->u.getName()).orElse("UnKnown"));
        System.out.println( userOpt2.map(u->u.getName()).orElse("Default"));

        List<String> interests = new ArrayList<String>();
        interests.add("a");
        interests.add("b");
        interests.add("c");
        user.setInterests(interests);
        List<String> interests2 = Optional.of(user).flatMap(u->Optional.ofNullable(u.getInterests())).orElse(Collections.emptyList());
        List<String> interests3 = Optional.of(user).flatMap(u->Optional.ofNullable(u.getInterests())).filter(str->str.size()==3).orElse(Collections.emptyList());
        //Optional.of(user).map(u->Optional.ofNullable(u.getInterests()));
        //List<String> interests3 = Optional.of(user).map(u->Optional.ofNullable(u.getInterests()));
        System.out.println( interests2.isEmpty());
        System.out.println( interests2);
        System.out.println( interests3);



    }
}
