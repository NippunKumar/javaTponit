package com.javatpoint.pack2;

import java.io.Serializable;

public class Employee extends Person implements Serializable  {


	private static final long serialVersionUID = -2892927121614640166L;

	private String name;


	public Employee(String name2, int id2, int salary2) {
		
		super(5, "Patna");
		System.out.println("Employee Class constructor called");
		this.id= id2;
		this.name= name2;
		this.salary= salary2;
		

	}

	private int id;
	transient private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", age="+this.age +",address="+this.Address +"]";
	}

}
