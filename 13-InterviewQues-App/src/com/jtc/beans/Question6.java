package com.jtc.beans;

import java.util.Arrays;
import java.util.List;

public class Question6 {
	
	   public static void main(String[] args) {
		
		   List<Integer> myList = Arrays.asList(12,1,24,26,39,47);
		              Integer max = myList.stream().max(Integer::compare).get();
		              System.out.println(max);
		                       
	}

}
