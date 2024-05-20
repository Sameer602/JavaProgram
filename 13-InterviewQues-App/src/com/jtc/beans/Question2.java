package com.jtc.beans;

import java.util.Arrays;
import java.util.List;

public class Question2 {
	
	  public static void main(String[] args) {
		
		 List<Integer> myList = Arrays.asList(10,25,24,3,2,13,16,19);
		    myList.stream().map(s->s+"")
		                   .filter(s->s.startsWith("1"))
		                   .forEach(System.out::println);
	  }
}
