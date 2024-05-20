package com.jtc.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApproach1 {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(101,"Nick","nick@gmail");
		Person p2 = new Person(101,"Orlen","orlen@gmail");
		Person p3 = new Person(101,"John","john@gmail");
		Person p4 = new Person(101,"Sam","sam@gmail");
		
	    List<Person> persons  =Arrays.asList(p1,p2,p3,p4);
	    
	    System.out.println("===========Objects Before Sorting=============");
	    
	    for(Person p : persons) {
	    	System.out.println(p);
	    }
	    System.out.println("==========Object After Sorting================");
	    //Sorting logic
	    Collections.sort(persons,new PersonComparator());
	    for(Person p : persons) {
	    	System.out.println(p);
	    }
		
	}

}

class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		
		return p1.getPname().compareTo(p2.getPname());
	}


	
}
