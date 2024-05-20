package com.jtc.beans;

import java.util.Arrays;
import java.util.List;

public class Question5 {
	
	  public static void main(String[] args) {
		
		  List<Integer> myList = Arrays.asList(10,12,17,21,32,56,69,75,82);
		  long count = myList.stream().count();
		  System.out.println(count);
	}

}
