package com.jtc.beans;

import java.util.HashSet;

public class DuplicateElementinArray {
	
	  public static void main(String[] args) {
		
		  String arr[] = {"java","python","C++","ruby","java"};
		  boolean status =false;
		  for(int i=0;i<arr.length;i++) {
			   for(int j=i+1;j<arr.length;j++) {
				   if(arr[i]==arr[j]) {
					   System.out.println("Found Duplicate Element::"+arr[i]);
					   status=true;
				   }
			   }
			  
		  }
		  if(status==false) {
			  System.out.println("Duplicate Element Not Found");
		  }
		  /*
		  // Approach-2 HashSet 
		  HashSet<String> set = new HashSet<>();
		  /* System.out.println(set.add("Java")); 
		   System.out.println( set.add("Python"));;
		   System.out.println( set.add("Java"));*/
		  /*  boolean flag = false;
		    for(String str:arr) {
			if(set.add(str)==false) {
				System.out.println("Duplicate Element Found::"+str);
				flag = true;
			}
		  }
		   if(flag==false) {
			   System.out.println("Duplicate Element Not Found");
		   }
		   */
	   }

}
