package com.mycom.java8;

import org.junit.jupiter.api.Test;

public class Employee {
    private String name;
    private Integer age;
    private Double salary;

    public Employee() {
    }

    public Employee(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    public static void changeUser(Employee u){
        u.setName("1111");
    }
    @Test
    public void test07() {
        Employee u = new Employee();
        changeUser(u);
        System.out.println(u);

    }
}
