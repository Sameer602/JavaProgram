package com.jtc.beans1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	
	   public static void main(String[] args) {
		
		   List<Student> students = Arrays.asList(
				     new Student("Sameer",22),
				     new Student("Vivek",20),
				     new Student("Ram",21),
				     new Student("Sameer",23),
				     new Student("Monika",24),
				     new Student("Tanvi",25)			   
				   );
		     Map<String, Integer> ageMap = students.stream()
		.collect(Collectors.toMap(Student::getName,Student::getAge,(existing,replacement)->replacement));
		//   System.out.println(ageMap);
		    ageMap.entrySet().stream()
		                   .sorted(Map.Entry.comparingByValue()) 
	      .forEachOrdered(entry ->System.out.println(entry.getKey()+":"+entry.getValue()));
	   
	   }
	   

}
