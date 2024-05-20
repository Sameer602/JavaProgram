package com.jtc.beans;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question17 {
	
	   public static void main(String[] args) {
		
		   String str="Telecommunication";
		      String[] ss = str.split("");
		      LinkedHashMap<String, Long> collect = Arrays.stream(ss).map(String::toLowerCase).collect(
		    		 Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()) 
		    		  );
		      System.out.println(collect);
	}

}
