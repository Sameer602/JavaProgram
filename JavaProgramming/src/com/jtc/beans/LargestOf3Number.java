package com.jtc.beans;

import java.util.Scanner;

public class LargestOf3Number {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter First Number::");
		    int a =  sc.nextInt();
		    
		    System.out.println("Enter Second Number::");
		    int b =  sc.nextInt();
		    
		    System.out.println("Enter Third Number::");
		    int c =  sc.nextInt();
		     
		    //Approach 1
		    if(a>b&&a>c) {
		    	System.out.println(a + "is Largest Number");
		    }else if(b>a&&b>c){
		    	System.out.println(b+"is Largest Number");
		    }else{
		    	System.out.println(c+"is Largest Number");
		    }
		    
		    //Ternary Operator in Java
		 int largest1 =   a>b?a:b;
		int largest2= c>largest1?c:largest1;
		
		System.out.println(largest2 + "is Largest Number");
		
		    
	}

}
