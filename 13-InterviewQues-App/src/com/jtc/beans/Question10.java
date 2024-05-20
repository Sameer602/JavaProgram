package com.jtc.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question10 {
	
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("Sameer","Ravi","Vaibhav");
		   List<String> nameList =   myList.stream().map(String::toUpperCase)
		                         .collect(Collectors.toList());
		   System.out.println(nameList);
		   
	}

}
