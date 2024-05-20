package com.jtc.beans;

import java.util.Arrays;
import java.util.List;

public class Question1 {
	
	  public static void main(String[] args) {
		
		  List<Integer> myList = Arrays.asList(9,10,11,12,16,25,28,3,36);
		  myList.stream().filter(i->i%2==0)
		                  .forEach(System.out::println);
	}

}
