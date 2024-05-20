package com.jtc.beans;

public class EvenOddfromArray {
	
	public static void main(String[] args) {
		  
		int a[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("Even Number from Array");
		
		for(int i = 0;i<a.length;i++) {
			
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		System.out.println("Odd Number from Array");
		for(int i=0;i<a.length;i++) {
			  if(a[i]%2!=0)
				  System.out.println(a[i]);
		}
		
	}

}
