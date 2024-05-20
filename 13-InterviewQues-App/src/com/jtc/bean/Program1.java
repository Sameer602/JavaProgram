package com.jtc.bean;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program1 {
	
	  public static void main(String[] args) {
		  
		 // String str = "Engineering";
		   //      String[] ss = str.split("");
		
		 /* List<Integer> myList = Arrays.asList(4,5,6,2,1,3);
		  Set<Integer> set = new HashSet<>();
		     /* myList.stream().filter(i->i%2==0)
		                     .forEach(System.out::println);*/
		  /*  myList.stream().map(s->s+"")
		                    .filter(s->s.startsWith("1"))
		                    .forEach(System.out::println);*/
		  /*  myList.stream().filter(s->!set.add(s))
		                    .forEach(System.out::println);*/
		   // myList.stream().findFirst().ifPresent(System.out::println);
		     /*  long count = myList.stream().count();
		       System.out.println(count);*/
		       /*  int max = myList.stream().max(Integer::compare).get();
		         System.out.println(max);*/
		   /*  myList.stream().sorted(Collections.reverseOrder())
		                     .forEach(System.out::println);*/
		       /* myList.stream().map(i->i*i*i)
		                        .filter(i->i>50)
		                        .forEach(System.out::println);*/
		       /* 
		        int[]  arr = {25,19,36,87,75,98,101,156,129};
		           Arrays.sort(arr);
		           Arrays.stream(arr).forEach(System.out::println);*/
             /*
		     List<String> myList = Arrays.stream(ss).map(String::toUpperCase)
		                      .collect(Collectors.toList());
		     System.out.println(myList);*/
		    
		    String str = "Programming";
		    String[] ss = str.split("");
		    Set<String> set = new HashSet<>();
		    
LinkedHashMap<String, Long> collect = Arrays.stream(ss).map(String::toLowerCase).collect(
		  Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())	
		    				);
		    		System.out.println(collect);
		    		
		    		
		   Optional<Entry<String, Long>> findFirst = collect.entrySet().stream().filter(k->k.getValue()==1).findFirst();
		   System.out.println(findFirst);
	}

}
