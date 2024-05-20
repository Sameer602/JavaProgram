package com.jtc.string;

import java.util.Arrays;

public class SortStringChars {
        
	  public static void main(String[] args) {
		
		  String str = "rock";
		     char[] arr = str.toCharArray();
		     char temp;
		     for(int i=0;i<arr.length;i++) {
		    	 for(int j=i+1;j<arr.length;j++) {
		    		if(arr[i]>arr[j]) {
		    			 temp = arr[i];
			    		 arr[i] = arr[j];
			    		 arr[j] = temp;
		    		}
		    	 }
		     }
		     System.out.println(new String(arr));
		     
	//Approach 2
		     String str1 = "sameer";
		  char[] ch =   str1.toCharArray();
		  Arrays.sort(ch);
		  System.out.println(new String(ch));
	}
}
