package com.jtc.beans;

import java.util.Arrays;
import java.util.List;

public class Program2 {
	
	   public static void main(String[] args) {
		
		   List<Integer> list = Arrays.asList(10,25,17,16,18,75,55,69);
		       list.stream().map(s->s+"")
		                     .filter(s->s.startsWith("1"))
		                     .forEach(System.out::println);
	}

}
