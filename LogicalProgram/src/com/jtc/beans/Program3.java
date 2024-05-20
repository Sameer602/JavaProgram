package com.jtc.beans;

import java.util.Arrays;
import java.util.List;

public class Program3 {
	
	   public static void main(String[] args) {
		
		   Person p1 = new Person("Sameer",21,31);
		   Person p2 = new Person("Vivek",22,32);
		   Person p3 = new Person("Ravi",23,33);
		   Person p4 = new Person("Naveen",24,34);
		   Person p5 = new Person("Aadarsh",25,34);
		   
		   List<Person> list = Arrays.asList(p1,p2,p3,p4,p5);
		        list.stream()
		                      .filter(s->s.getName().startsWith("S"))
		                      .forEach(System.out::println);
		   
	}

}
