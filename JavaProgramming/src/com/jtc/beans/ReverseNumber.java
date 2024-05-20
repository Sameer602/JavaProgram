 package com.jtc.beans;

import java.util.Scanner;

public class ReverseNumber {
	
	  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number::");
		int num = sc.nextInt();
		/*
		//Logic 1- Using Alogirthms
		  int rev = 0;
		  while(num!=0) {
			  rev = rev*10+num%10;
			  num= num/10;
		  }	*/
		/*
		//Logic 2 -Using StringBuffer class
		
		        StringBuffer rev;
		        StringBuffer sb =  new StringBuffer(String.valueOf(num));//Convert num int String format
		          rev = sb.reverse();*/
		
	//	Logic 3 -Using StringBuilder class
		        StringBuilder rev;
		        StringBuilder sbl = new StringBuilder();
		        sbl.append(num);
		    rev =  sbl.reverse();
			    System.out.println("Reverse Number is ::"+rev);
		  
		
	}

}
