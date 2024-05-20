package com.jtc.beans;

import java.util.Arrays;
import java.util.List;

public class Question4 {
	
	  private static List<Integer> asList;

	public static void main(String[] args) {
		
	List<Integer> myList = Arrays.asList(10,12,15,17,18,21,23);
	  myList.stream().findFirst()
	                 .ifPresent(System.out::println);
	  
	}

}
