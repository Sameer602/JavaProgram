package com.jtc.string;

public class RemoveSpecialChars {
	
	  public static void main(String[] args) {
		
		  String str = "@##SA***M%%%EE***R";
		  
		  //Approach-1
		  String trimmedString = str.replaceAll("[^a-zA-Z0-9]", "");
		  System.out.println(trimmedString);
	}

}
