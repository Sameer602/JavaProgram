package com.jtc.beans;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question3 {
	
	   public static void main(String[] args) {
		
		   List<Integer> myList =Arrays.asList(10,11,12,15,16,12,11,19,20,21);
		   Set<Integer> set = new HashSet<>();
		   myList.stream().filter(s->!set.add(s))
		                   .forEach(System.out::println);
	}

}
