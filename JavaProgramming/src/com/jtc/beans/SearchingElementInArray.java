package com.jtc.beans;

public class SearchingElementInArray {
	
	  public static void main(String[] args) {
		  
		  int[] arr = {10,15,20,25,30};
		  int search_element = 20;
		  boolean flag = true;
		  for(int i = 0;i<arr.length;i++) {
			  if(arr[i]==search_element) {
				  System.out.println("Element Found::"+arr[i]);
				  flag= true;
				  break;
				  
			  }
		  }
		  if(flag==false) {
			  System.out.println("Element Not Found");
		  }
		
		
	}

}
