package com.jtc.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamesFilter {
	
	  public static void main(String[] args) {
		
		  List<String> list = new ArrayList<>();
		  list.add("Anuskha");
		  list.add("TriSha");
		  list.add("NainTara");
		  list.add("Deepikka");
		  list.add("Pooja Hegde");
		  list.add("Amisha Patel");
		  
		  Stream<String> stream = list.stream();
		 /* Stream<String> filteredStream = stream.filter(s->s.startsWith("A"));
		  filteredStream.forEach(System.out::println);*/
		  stream.filter(name->name.startsWith("A"))
		        .forEach(System.out::println);
	}

}
