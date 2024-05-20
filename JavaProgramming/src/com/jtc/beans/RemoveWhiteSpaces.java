package com.jtc.beans;

public class RemoveWhiteSpaces {
	
	  public static void main(String[] args) {
		
		  String str = "Java   Programming   Selenium   Automation";
		str =  str.replaceAll("\\s","");
		System.out.println(str);
	}

}
