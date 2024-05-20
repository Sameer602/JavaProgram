package com.jtc.beans;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program4 {
	
	  public static void main(String[] args) {
		
		  List<Integer> myList = Arrays.asList(10,25,23,10,35,65,25);
		   /* Set<Integer> set = new HashSet();
		    myList.stream().filter(n->!set.add(n))
		    .forEach(System.out::println);
		  long count =   myList.stream().count();
		    System.out.println(count);
		    myList.stream().findFirst()
		          .ifPresent(System.out::println);*/
		  int max  = myList.stream()
				         .max(Integer::compare)
				         .get();
		  System.out.println(max);
	}

}
