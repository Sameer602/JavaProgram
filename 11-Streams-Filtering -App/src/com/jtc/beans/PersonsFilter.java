package com.jtc.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PersonsFilter {   
	
	   public static void main(String[] args) {
		
		   //List<Person> persons = new ArrayList<>();
		   
		     Person p1 = new Person("Raju",28,"Software");
		     Person p2 = new Person("Sameer",30,"Teacher");
		     Person p3 = new Person("Mahesh",52,"Mechanic");
		     Person p4 = new Person("Arjun",25,"Doctor");
		     Person p5 = new Person("Karan",48,"Driver");
		     
	//	     persons.add(p1);persons.add(p2);persons.add(p3);persons.add(p4);persons.add(p5);
		        List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		        
		       /* Stream<Person> stream = persons.stream();
		        Stream<Person> filteredStream = stream.filter(p->p.getAge()>21&&p.getAge()<32);
		          filteredStream.forEach(System.out::println);*/
		        persons.stream().filter(p->p.getAge()>21&&p.getAge()<32&&p.getJob().equals("Software"))
		            .forEach(System.out::println);
		   
	}

}
