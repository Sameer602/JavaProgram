package com.jtc.beans;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PersonNamesPrint {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Raju",21);
		Person p2 = new Person("Shivam",15);
		Person p3 = new Person("Abhi",17);
		Person p4 = new Person("Varun",28);
		Person p5 = new Person("Bablu",19);
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		Predicate<Person> predicate = (p)->p.getAge()>18;
		
		for(Person person :persons) {
			  boolean isEligible = predicate.test(person);
			  if(isEligible) {
				  System.out.println(person.getName());
			  }
		}
	}

}
