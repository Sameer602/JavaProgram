package com.jtc.beans;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int a[] = {4,2,1,5,3};
		System.out.println("Arrays Before Sorting::"+Arrays.toString(a));
		int n = a.length;
		
		for(int i=0;i<n-1;i++) {  //No of passes
			for(int j=0;j<n-1;j++) {    //Iteration
		        if(a[j]>a[j+1]) {
		        	int temp = a[j];
		        	    a[j] = a[j+1];
		        	    a[j+1] = temp;
		        }
			}
		}
		System.out.println("Arrays After Sorting ::"+Arrays.toString(a));
	}

}
