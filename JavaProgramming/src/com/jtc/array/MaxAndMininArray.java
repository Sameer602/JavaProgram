package com.jtc.array;

public class MaxAndMininArray {
	
	public static void main(String[] args) {
		
		int a[] = {20,30,50,40,10,60};
		
		int max =  a[0];
		for(int i=1;i<a.length;i++) {
			  if(a[i]>max) {
				  max=a[i];
			  }
		}
		System.out.println("Maximum Element in Array is::"+max); 	
	}

}
