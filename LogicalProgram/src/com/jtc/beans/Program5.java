package com.jtc.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program5 {
	
	   public static void main(String[] args) {
		
		   List<Integer> myList = Arrays.asList(11,25,26,54,86,5,9,21);
		      /*  myList.stream().sorted()
		               .forEach(System.out::println);*/
		       myList.stream().sorted(Collections.reverseOrder())
		                      .forEach(System.out::println);
		       
		     
	}

}
