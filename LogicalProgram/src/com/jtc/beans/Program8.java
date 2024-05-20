package com.jtc.beans;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program8 {
	
	  public static void main(String[] args) {
		String str="AADRJIIIjtcindiajjsat";
		 String[] ss = str.split("");
			 Map<String, Long> collect = Arrays.stream(ss)
 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(collect);  
	}

}
