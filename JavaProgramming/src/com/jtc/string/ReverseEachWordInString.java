package com.jtc.string;

public class ReverseEachWordInString {
	
	  public static void main(String[] args) {
		
		  String input = "java code ";
		  
		  System.out.println("Original String is::"+input);
		  
		    String output = "";
		  
		   String[] words = input.split(" ");
		     for(String word: words) {
		    	 String reverseWord ="";
		    	   for(int i=word.length()-1;i>=0;i--) {
		    		   reverseWord = reverseWord + word.charAt(i);
		    	   }
		    	 output= output +reverseWord+" "; 
		     }
		     System.out.println("Reverse String is::"+output);
		     
		     
	}

}