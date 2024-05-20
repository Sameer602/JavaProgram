package com.jtc.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question8 {
	
	public static void main(String[] args) {
		
		          List<Integer> myList = Arrays.asList(5,12,2,9,19,9,5,16,21,14);
		          
		          Set set = new HashSet<>();
		          
		          //myList.stream().sorted(Collections.reverseOrder())
		               //          .forEach(System.out::println);
		         // myList.stream().findFirst().ifPresent(System.out::println);
		         // long count = myList.stream().count();
		         // System.out.println(count);
		         // Integer max = myList.stream().max(Integer::compare).get();
		         // System.out.println(max);
		         // myList.stream().filter(i->i%2==0)
		          //.forEach(System.out::println);
		         /* myList.stream().map(s->s+"")
		                          .filter(s->s.startsWith("1"))
		                           .forEach(System.out::println);*/
		          myList.stream().filter(n->!set.add(n))
		                         .forEach(System.out::println );
		          
	}

}
