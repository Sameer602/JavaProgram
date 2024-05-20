package com.jtc.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question12 {
	
	    public static void main(String[] args) {
			
	    	List<String> myList = Arrays.asList("AA","CC","BB","AA","DD");
	    	Map<String, Long> namesCount = myList.stream()
	    	      .filter(x->Collections.frequency(myList, x)>1)
	    	      .collect(
	    	    		 Collectors.groupingBy(Function.identity(),Collectors.counting()) 
	    	    		  );
	    	System.out.println(namesCount);
		}

}
