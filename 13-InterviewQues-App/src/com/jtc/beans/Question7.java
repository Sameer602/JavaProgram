package com.jtc.beans;

import java.util.Arrays;
import java.util.List;

public class Question7 {
	
	 public static void main(String[] args) {
		
		 List<Integer> myList = Arrays.asList(10,15,2,14,19,36,45,43,9);
		   myList.stream().sorted()
		                   .forEach(System.out::println);
	}

}
