package com.jtc.beans;

import java.util.Arrays;
import java.util.List;

public class Question13 {
	
	  public static void main(String[] args) {
		
		  List<Integer> myList = Arrays.asList(11,16,26,6,92,101);
		   int max = myList.stream()
				         .max(Integer::compare)
				         .get();
		   System.out.println(max);
	}

}
