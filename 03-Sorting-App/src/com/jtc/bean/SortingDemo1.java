package com.jtc.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemo1 {
	
	  public static void main(String[] args) {
		  ArrayList<Integer> al = new ArrayList<>();
		  al.add(10);
		  al.add(21);
		  al.add(15);
		  al.add(8);
		  al.add(12);
		  
		  System.out.println("Elements Before Sorting ::"+ al);
		  
		Collections.sort(al, (o1,o2) -> {
			return (o1>o2)?1:(o1<o2)?-1:0;
		});
		  
		  
		  System.out.println("Elements After Sorting ::"+ al);
	  }
}
class  ElementsSortingComparator1 implements Comparator<Integer>{
	  
	@Override
	public int compare(Integer o1, Integer o2) {
		/*if(o1>o2) {
			 return -1;
		 }else if(o2>o1) {
			 return 1;
		 }else {
			 return 0;
		 }*/
		return (o1>o2)?1:(o1<o2)?-1:0;
     }



	}


