package com.mycom.java8;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaTest {

    @Test
    void test01() {
        //使用匿名内部类
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        TreeSet<Integer> set = new TreeSet<>(comparator);
        set.add(2);
        set.add(22);
        set.add(222);
        set.add(2222);
        set.add(20);
        System.out.println(set);
    }

    @Test
    void test02() {
        //使用lambda表达式
        Comparator<Integer> comparator = (a, b) -> Integer.compare(a, b);
        TreeSet<Integer> set = new TreeSet<>(comparator);
        set.add(2);
        set.add(22);
        set.add(222);
        set.add(2222);
        set.add(20);
        System.out.println(set);
    }

    //需求：获取当前公司中员工年龄大于35的员工信息
    @Test
    void test03() {
        List<Employee> list = Arrays.asList(
                new Employee("张三",18,9999.99),
                new Employee("李四",38,5555.55),
                new Employee("王五",50,6666.66),
                new Employee("赵六",16,3333.33),
                new Employee("田七",8,7777.77)
        );
        List<Employee> result = new ArrayList<>();
        //传统的遍历方式
        /*for (Employee e:list
             ) {
            if(e.getAge()>35){
                result.add(e);
            }
        }
        System.out.println(result);*/

        //使用java8提供的遍历方式
        list.forEach(e->{
            if(e.getAge()>35){
                result.add(e);
            }
        });

        System.out.println(result);
    }
    //需求：获取当前公司中员工工资大于5000的员工信息
    @Test
    void test04() {
        List<Employee> list = Arrays.asList(
                new Employee("张三", 18, 9999.99),
                new Employee("李四", 38, 5555.55),
                new Employee("王五", 50, 6666.66),
                new Employee("赵六", 16, 3333.33),
                new Employee("田七", 8, 7777.77)
        );
        List<Employee> result = new ArrayList<>();
        //可以仿照上面的方式进行实现的
    }
    //进行优化：对需要使用的条件提取出来，写成通用的，使用接口（策略设计模式）
    //需求：获取当前公司中员工工资大于5000的员工信息
    @Test
    void test05() {
        List<Employee> list = Arrays.asList(
                new Employee("张三", 18, 9999.99),
                new Employee("李四", 38, 5555.55),
                new Employee("王五", 50, 6666.66),
                new Employee("赵六", 16, 3333.33),
                new Employee("田七", 8, 7777.77)
        );
        List<Employee> result = new ArrayList<>();
        //可以直接创建接口的实现类的，这里直接使用参数化的方式进行实现（其实就是匿名内部类）
        MyPredicate<Employee> my = new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getSalary()>5000;
            }
        };
        result = findEmployee(list,my);
        System.out.println(result);
    }
    //需求：获取当前公司中员工工资大于5000的员工信息
    //使用lambda表达式
    @Test
    void test06() {
        List<Employee> list = Arrays.asList(
                new Employee("张三", 18, 9999.99),
                new Employee("李四", 38, 5555.55),
                new Employee("王五", 50, 6666.66),
                new Employee("赵六", 16, 3333.33),
                new Employee("田七", 8, 7777.77)
        );
        List<Employee> result = new ArrayList<>();
        //可以直接创建接口的实现类的，这里直接使用参数化的方式进行实现（其实就是匿名内部类）
        result = findEmployee(list,e->e.getSalary()>5000);
        result.forEach(System.out::println);
    }
    //需求：获取当前公司中员工工资大于5000的员工信息
    //使用Stream API
    @Test
    void test07() {
        List<Employee> list = Arrays.asList(
                new Employee("张三", 18, 9999.99),
                new Employee("李四", 38, 5555.55),
                new Employee("王五", 50, 6666.66),
                new Employee("赵六", 16, 3333.33),
                new Employee("田七", 8, 7777.77)
        );
        List<Employee> result = new ArrayList<>();
        //直接使用stream进行过滤操作，配合使用Collect进行结果的返回
        /*result = list.stream().filter(e->e.getSalary()>5000).collect(Collectors.toList());
        result.forEach(System.out::println);*/
        //或者可以使用forEach进行输出操作
        list.stream().filter(e->e.getSalary()>5000).forEach(System.out::println);
        //输出名字的前两个
        list.stream().map(Employee::getName).limit(2).forEach(System.out::println);
    }

    private List<Employee> findEmployee(List<Employee> list, MyPredicate<Employee> my) {
        List<Employee> result = new ArrayList<>();
        for (Employee e:list
             ) {
            if(my.test(e)){
                result.add(e);
            }
        }
        return result;
    }


}