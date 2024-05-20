package com.jtc.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program10 {
	
	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("aa","bb","cc","dd");
		
		  myList.stream().map(String::toUpperCase)
		               .collect(Collectors.toList())
		               .forEach(System.out::println);
	}

}
