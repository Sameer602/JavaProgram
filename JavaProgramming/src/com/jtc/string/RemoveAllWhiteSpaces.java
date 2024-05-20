package com.jtc.string;

public class RemoveAllWhiteSpaces {
	
	  public static void main(String[] args) {
		
		  String str ="   ja  va s  ta  r  ";
		  
		  String replaceAll = str.replaceAll("\\s", "");
		  System.out.println(replaceAll);
		     
		//  String trimmedString = str.trim();
		//  System.out.println(trimmedString);
		  
	}

}
