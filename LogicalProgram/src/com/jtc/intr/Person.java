package com.jtc.intr;

public class Person {
	
	  private int id;
	  	  
	  private double salary;

	public Person(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", salary=" + salary + "]";
	}
	  
	
}

