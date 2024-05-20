package com.jtc.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program14 {
	
	    public static void main(String[] args) {
	    	   int[] nums = {1,2,3,4}; 
	    	boolean status = containsDuplicate( nums);
	    	System.out.println(status);
	   }
	     /* List<Integer> myList = Arrays.asList(10,11,12,13,14,15,16);
	           myList.stream().filter(i->i%2==0)
	                           .forEach(System.out::println);
		}*/
	    	/*
	    	List<Integer> myList = Arrays.asList(10,25,65,31,15,55,18);
	    	myList.stream().map(s->s+"").filter(s->s.startsWith("1"))
	    	                            .forEach(System.out::println);*/
	    	
	   /* 	List<Integer> myList = Arrays.asList(10,15,21,10,65,15,68);
	    	  Set<Integer> set = new HashSet<>();
	    	    myList.stream().filter(n->!set.add(n)).forEach(System.out::println);*/
	    	
	    	/*List<Integer> myList = Arrays.asList(10,11,12,15,16,18);
	    	    myList.stream().findFirst().ifPresent(System.out::println);*/
	    	
	    	/*List<Integer> myList = Arrays.asList(10,11,15,14,17,155,65,88);
	    	 long count = myList.stream().count();
	    	 System.out.println(count);*/
	    	
	    	/*  List<Integer> myList = Arrays.asList(10,15,45,69,88,99,67,87);
	    	int max =  myList.stream().max(Integer::compare).get();
	    	System.out.println(max);*/
	    	
	    	/*List<Integer> myList = Arrays.asList(21,5,52,43,68,25,16,11,9);
	    	  myList.stream().sorted(Collections.reverseOrder())
	    	  .forEach(System.out::println);*/
	    	
	    	/*List<Integer> myList = Arrays.asList(4,5,6,1,2,3,7);
	    	  myList.stream().map(i -> i*i*i)
	    	                   .filter(i -> i>50)
	    	                   .forEach(System.out::println);*/
	    	     
	    	/*String str = "sameer";    	
	    	String[] ss =  str.split("");
	    	List<String> nameList = Arrays.stream(ss).map(String ::toUpperCase)
	    			                                  .collect(Collectors.toList());
	    	System.out.println(nameList);*/ 
	    	/*
	    	List<String> myList = Arrays.asList("AA","BB","CC","AA","DD");
	    	 Map<String, Long> collect = myList.stream()
	    	   .filter(x->Collections.frequency(myList,x)>1)
	    	  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    	  System.out.println(collect); */
	    	
	    /*	int arr[] = {10,15,54,69,88,54,97,36};
	    	  int max =  Arrays.stream(arr).max().getAsInt();
	    	  System.out.println(max);*/
	    	
	    	
	    	/*  String str = "Engineering";
	    	  String[] ss =   str.split("");
	    	  Map<String, Long> collect = Arrays.stream(ss).map(String::toLowerCase).collect(
	    			 Collectors.groupingBy(Function.identity(),Collectors.counting()) 
	    			  
	    			  );
	    	  System.out.println(collect);*/
	    	
	    /*  int[] arr = {14,11,19,15,54,6,45,89,81,75,71,65};
	      
	      Arrays.parallelSort(arr);
	      
	      Arrays.stream(arr).forEach(n->System.out.print(n+" "));*/
	    	
	   /* List<String> list1 = Arrays.asList("Java","8","are");
	    List<String> list2 = Arrays.asList("explained","through","Examples");
	    
	    Stream<String> concatStream = Stream.concat(list1.stream(),list2.stream());
	    
	       concatStream.forEach(n->System.out.print(n+" "));*/
	    	
	    	/*System.out.println("Current Local Date::"+java.time.LocalDate.now());
	    	System.out.println("Current Local Time::"+ java.time.LocalTime.now());
	    	System.out.println("Current Local DateTime::"+java.time.LocalDate.now());*/
	    	
	    /*	String str = "Programming";
	    	String[] ss =  str.split("");
	    	LinkedHashMap<String, Long> collect = Arrays.stream(ss).map(String::toLowerCase)
	    	                 .collect(
	    	                 		Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())     	                		 
	    	                		 );
	    	 Optional<Entry<String, Long>> findFirst = collect.entrySet().stream().filter(k->k.getValue()==1).findFirst();
	    	      System.out.println(findFirst);*/
	    	public  static boolean containsDuplicate(int[] nums) {	    	   	  
	    		  return Arrays.stream(nums)
	                      .distinct() // Remove duplicates
	                      .count() != nums.length; // Check if count changed 
	    }
	    
}
