package com.jtc.string;

import java.util.Arrays;

public class CharWithOccurence {
	
	  public static void main(String[] args) {
		
		  String input ="opentext";
		  //expected output = open1ex2
		  char charToReplace = 't';
		  //check check char presence in String
		  if(input.indexOf(charToReplace)==-1) {
			  System.out.println("Given Character Not Available In input String");
			   System.exit(0);	
		  }
		  //Logic to replace char occurence in String
		    int count =1;
		    for(int i=0;i<input.length();i++) {
		    	char ch =  input.charAt(i);
		    	if(ch==charToReplace) {
		    		input  =  input.replaceFirst(String.valueOf(charToReplace),String.valueOf(count));
		    		  count++;
		    	}
		    }
		  System.out.println(input);
		  
		 /* char[] arr =   input.toCharArray();
		  int cnt =1;
		  for(int i=0;i<arr.length;i++) {
			    if(arr[i]==charToReplace) {
			    	   arr[i]=String.valueOf(cnt).charAt(0);
			    	   cnt++;
			    }
		  }
		  System.out.println(Arrays.toString(arr));*/
		  
	}

}
