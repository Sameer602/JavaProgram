package com.jtc.bean;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program3 {
	
	public static void main(String[] args) {
		
	  String str = "Programming In Java";
	  String[] ss = str.split("");
	  
	  Set<String> set = new HashSet<>();
	     
	  LinkedHashMap<String, Long> collect = Arrays.stream(ss).map(String::toLowerCase)
	                   .collect(
	                	Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())	   
	                		   
	                		   );
	       System.out.println(collect);
	  
	       Optional<Entry<String, Long>> findFirst = collect.entrySet().stream().filter(k->k.getValue()==1).findFirst();
	          System.out.println(findFirst.get());
	}

}
