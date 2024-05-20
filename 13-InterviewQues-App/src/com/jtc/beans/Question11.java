package com.jtc.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question11 {
	
	   public static void main(String[] args) {
		
		  List<String> myList = Arrays.asList("AA","BB","CC","AA","DD");
		         
		  Map<String, Long> names = myList.stream().collect(
				        Collectors.groupingBy(Function.identity(),Collectors.counting())
				  
				  );
		  System.out.println(names);
	}

}
