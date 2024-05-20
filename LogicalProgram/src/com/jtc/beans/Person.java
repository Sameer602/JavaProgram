package com.jtc.beans;

public class Person { 
	  
	 private String name;
	 private Integer pid;
	 private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + ", age=" + age + "]";
	}
	public Person(String name, Integer pid, Integer age) {
		super();
		this.name = name;
		this.pid = pid;
		this.age = age;
	}
	 
}
