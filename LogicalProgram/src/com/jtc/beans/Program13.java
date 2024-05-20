package com.jtc.beans;

import java.util.Arrays;  
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program13 {	
	public static void main(String[] args) {
	
		//Set<String> set = new LinkedHashSet<>();
		String str = "Java Articles are Awesome";
		String[] split = str.split("");
		LinkedHashMap<String,Long> collect = Arrays.stream(split).
	 collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		       
		      System.out.println(collect);
		      Optional<Entry<String,Long>> first = collect.entrySet()
		    		  .stream().filter(k->k.getValue()==1).findFirst();
		      System.out.println(first.get());
		      
		        
	}

}
