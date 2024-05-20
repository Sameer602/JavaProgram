package com.jtc.bean;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program2 {
	
	public static void main(String[] args) {
		
		//List<Integer> myList = Arrays.asList(7,8,9,1,2,3);
		
		///myList.stream().findFirst().ifPresent(System.out::println);
		
		/*  myList.stream().filter(i->i%2==0)
		                 .forEach(System.out::println);*/
		/*
		myList.stream().map(s->s+"")
		                .filter(s->s.startsWith("1"))
		                   .forEach(System.out::println);*/
		/*        
	    Set<Integer> set = new HashSet<>();
	    myList.stream().filter(s->!set.add(s))
	                    .forEach(System.out::println);*/
		     /*
		      long count = myList.stream().count();
		      System.out.println(count);*/
		      /*
		        int max = myList.stream().max(Integer::compare).get();
		        System.out.println(max);*/
		      
		//myList.stream().sorted().forEach(System.out::println);
		 // myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		//  myList.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);
		/*
		 String str ="Enginnering";
		   String[] ss = str.split("");
		   List<String> nameList = Arrays.stream(ss).map(String::toUpperCase).collect(Collectors.toList());
		   System.out.println(nameList);*/
		/*
		List<String> myList = Arrays.asList("AA","BB","CC","AA","DD");
		    Map<String, Long> wordCount = myList.stream()
		    		.filter(x->Collections.frequency(myList, x)>1)
		    		.collect(
		    		  Collectors.groupingBy(Function.identity(),Collectors.counting())		    		
		    );
		    System.out.println(wordCount);*/
		
		String str = "Engineering";
		String[] ss = str.split("");
		LinkedHashMap<String, Long> collect = Arrays.stream(ss).map(String::toLowerCase)
		                 .collect(
		                	Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())	 
		                		 
		                		 );
		System.out.println(collect);
		
		
		
		
	}

}
