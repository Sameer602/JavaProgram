package com.jtc.beans;

public class ReverseAString {
	
	
	  public static void main(String[] args) {
		
	// 1-Using concatenation operation 
		  String str = "ABCD";
		  String rev = "";
		  /*
		  int len = str.length();
		  for(int i=len-1;i>=0;i--) {
			  rev = rev + str.charAt(i);
		  }*/
		  
	  //2- Using character array
		/*  char a[] = str.toCharArray();
		int len = a.length;
		for(int i = len-1;i>=0;i--) {
			//rev = rev + str.charAt(i);
			rev = rev + a[i];
			System.out.println("Reverse String is ::"+rev); 
		}*/
		  
	    //3-Using StringBuffer class
		  StringBuffer sb = new StringBuffer(str);
		  System.out.println(sb.reverse());	  
	}
}
