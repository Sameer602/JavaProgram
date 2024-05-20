package com.jtc.beans;

public class RemoveJunk {
	
	  public static void main(String[] args) {
		
		  String str = "@#$$ACSD%%$%abc1234567";
		 str = str.replaceAll("[^a-zA-Z1-9]","");
		 System.out.println(str);
	}

}
