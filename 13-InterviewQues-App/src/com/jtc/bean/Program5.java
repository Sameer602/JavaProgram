package com.jtc.bean;

import java.util.Arrays; 
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program5 {
	
	    public static void main(String[] args) {
			/* 
	    	String str = "Programming";
	    	String[] ss = str.split("");
	    	LinkedHashMap<String, Long> collect = Arrays.stream(ss).map(String::toUpperCase).collect(
	    			Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())
	    			);
	    	System.out.println(collect);
	    	*/
	    	List<String> myList = Arrays.asList("AA","BB","CC","AA","DD");
	    	  Map<String, Long> collect = myList.stream().filter(x->Collections.frequency(myList,x)>1)
	    	                 .collect(
	    	                		Collectors.groupingBy(Function.identity(),Collectors.counting()) 
	    	                		 );
	    	System.out.println(collect);
	    	
	    }

}
