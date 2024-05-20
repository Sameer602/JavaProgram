package com.jtc.beans;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementInArray {
	
	  public static void main(String[] args) {
		
		//Approach-1
		Integer a[] =  {30,50,60,40,20,10};
		
		System.out.println("Arrays Element Before Sorting::"+Arrays.toString(a));
		
	//	Arrays.parallelSort(a);
		
	//	System.out.println("Arrays Element After Sorting::"+Arrays.toString(a));
		
		//Approach--2
		
		//Arrays.sort(a);
		//System.out.println("Arrays Element After Sorting::"+Arrays.toString(a));
		
		//In Reverse Sorted Order
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Arrays Element After Sorting::"+Arrays.toString(a));
		
		
		  
	}

}
