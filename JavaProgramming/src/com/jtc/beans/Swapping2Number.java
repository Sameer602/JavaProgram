package com.jtc.beans;

public class Swapping2Number {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("Before Swaapping ::"+a+" "+b);
		
	   /* //Logic1 - Third Variable		
		int t=a;
		a=b;
		b=t;*/
		//Logic 2 - By Using + and - operators
		   a=a+b;
		   b=a-b;
		   a=a-b;
		   
		   
		  //Logic 3- By using * and / operators
          /*  a=a*b;
            b=a/b;
            a=a/b;*/
		   
		 //  Logic 4 - By Using Bitwise XOR(^) Operator
		    a=a^b;
		    b=a^b;
		    a=a^b;
		   
		  System.out.println("After Swapping::"+a+" "+b);
		  
		
		
		
	}

}
