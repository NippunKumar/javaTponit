package com.javatpoint.pack2;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -3216968774585522982L;
	int age;
	String Address;


	public Person(){
		System.out.println("Person Class constructor called");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Person(int age, String address) {
		
		this.age = age;
		this.Address = address;
	}

}
