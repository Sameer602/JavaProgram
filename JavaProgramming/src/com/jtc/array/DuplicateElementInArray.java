package com.jtc.array;

public class DuplicateElementInArray {
	
	   public static void main(String[] args) {
		   
		   String arr[]= {"java","python","C","C++","java"};
		   
		    boolean flag = false;
		   for(int i=0;i<arr.length;i++) {
			   for(int j=i+1;j<arr.length;j++) {
				   if((arr[i]==arr[j])&&(i!=j)) {
					   System.out.println("Duplicate Element Found::"+arr[i]);
					   flag=true;
				   }
			   }
		   }		   
		   if(flag==false) {			   
			   System.out.println("Duplicate Element Not Found");				   
		   }
	}

}
