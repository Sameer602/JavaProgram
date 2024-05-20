package com.jtc.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program11 {
	
	  public static void main(String[] args) {
		
		  List<String>  names = Arrays.asList("Hii","Good","Morning","Friend");
		  Map<String,Long> namesCount  =  names.stream().collect(
		    		   Collectors.groupingBy(Function.identity(),Collectors.counting())
		    		   );
		       System.out.println(namesCount);
		      
	}

}
