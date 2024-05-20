package com.jtc.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamesMapping {
	
	   public static void main(String[] args) {

			  List<String> list = new ArrayList<>();
			  list.add("Anuskha");
			  list.add("TriSha");
			  list.add("NainTara");
			  list.add("Deepikka");
			  list.add("Pooja Hegde");
			  list.add("Amisha Patel");
			  
			  Stream<String> stream = list.stream();
			  stream.map(name->name.toUpperCase())
			         .forEach(System.out::println);
	}

}
