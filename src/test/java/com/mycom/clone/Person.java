/*
package com.mycom.clone;

import static org.junit.Assert.*;

import org.junit.Test;

class Address implements Cloneable {
	private String type;
	private String value;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "type=" + this.getType() + ",value=" + this.getValue();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

public class Person implements Cloneable {
	private String name;
	private Integer age;

	private Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
		Object obj=super.clone();
        Address a=((Person)obj).getAddress();
        if(a!=null) {
        	((Person)obj).setAddress((Address) a.clone());
        }
        return obj;
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

	public Address getAddress(){
		return address;
	}
	public Address getAddressClone() throws CloneNotSupportedException {
		return (Address)address.clone();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "person[name=" + this.getName() + ",age=" + this.getAge();
		
		str += ",address[";
		str += this.getAddress()==null?"":this.getAddress().toString();
		str += "]";
		
		str += "]";
		
		return str;
	}

	*/
/**
	 * 简单属性
	 * 
	 * @throws Exception
	 *//*

	@Test
	public void testShallowCopySimple() throws Exception {
		Person p1 = new Person();
		p1.setAge(31);
		p1.setName("Peter");

		Person p2 = (Person) p1.clone();
		System.out.println(p1 == p2);// false
		p2.setName("Jacky");
		System.out.println("p1=" + p1);// p1=Person [name=Peter, age=31]
		System.out.println("p2=" + p2);// p2=Person [name=Jacky, age=31]
	}

	*/
/**
	 * 引用属性
	 * 
	 * @throws Exception
	 *//*

	@Test
	public void testShallowCopyFixed() throws Exception {
		Address address = new Address();
		address.setType("Home");
		address.setValue("北京");

		Person p1 = new Person();
		p1.setAge(31);
		p1.setName("Peter");
		p1.setAddress(address);
//		p1.setAddress((Address)address.clone());

		Person p2 = (Person) p1.clone();
		System.out.println(p1 == p2);// false]
		p2.getAddress().setType("Office");
		System.out.println("p1=" + p1);
		System.out.println("p2=" + p2);
	}
}*/
