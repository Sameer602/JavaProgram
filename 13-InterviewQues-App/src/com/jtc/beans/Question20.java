package com.jtc.beans;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question20 {
	
	  public static void main(String[] args) {
		  
		Set<String> set = new LinkedHashSet<>();
		  String str = "Programming";
		    String[] ss = str.split("");
		    Map<String, Long> collect = Arrays.stream(ss).map(String::toLowerCase)
		                    .collect(
		                    Collectors.groupingBy(Function.identity(),Collectors.counting())		
		                    		);
		    System.out.println(collect);
		     
		     Optional<Entry<String, Long>> first = collect.entrySet().stream().filter(k->k.getValue()!=1).findFirst();
		     System.out.println(first);
		    
	}

}
