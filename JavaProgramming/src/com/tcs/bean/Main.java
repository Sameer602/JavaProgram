package com.tcs.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	
	   public static void main(String[] args) {
		
		  List<Employee> myList = Arrays.asList(
				    new Employee("Supriya",23),
				    new Employee("Shivani",20),
				    new Employee("Tanvi",21),
				    new Employee("Supriya",22),
				    new Employee("Aarti",24)			  
				  );
		    Map<String, Integer> collect = myList.stream()
   .collect(Collectors.toMap(Employee::getName,Employee::getAge,(existing,replacement)->replacement));
		    collect.entrySet().stream().sorted(Map.Entry.comparingByValue())
		    .forEachOrdered(entry -> System.out.println(entry.getKey()+":"+entry.getValue()));
	}

}
