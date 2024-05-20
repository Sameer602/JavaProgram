package com.jtc.array;

import java.util.ArrayList;

public class EvenAndOddInArray {
	
	  public static void main(String[] args) {
		  
		  int a[] = {8,5,10,12,3,1,4};
		   		
		  ArrayList<Integer> al1 = new ArrayList<>();
		  ArrayList<Integer> al2 = new ArrayList<>();
		  
		  for(int i=0;i<a.length;i++) {
			  if(a[i]%2==0) {
				    al1.add(a[i]);
			  }else {
				  al2.add(a[i]);
			  }
		  }
		  System.out.println("Even No are::");
		  int total1 =0;
		  for(int n:al1) {
			  total1= total1+n;
			  System.out.println(n);
		  }
		  System.out.println("No of Even No::"+al1.size());
		  System.out.println("Sum of Even No are::"+total1);
		  System.out.println("Odd No are::");
		  int total2 = 0;
		  for(int n:al2) {
			  total2 = total2+n;
			  System.out.println(n);
		  }
		  System.out.println("No of Odd No are::"+al2.size());
		  System.out.println("Sum of Odd No are::"+total2);
		  
	}

}
