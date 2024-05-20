package com.jtc.bean;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingApproach3 {
	    
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
			  ///SortingLogic
			   Collections.sort(persons,(o1,o2)->o1.getPname().compareTo(o2.getPname()));
			   for(Person p : persons) {
			    	System.out.println(p);
			    }		    
			}
}
