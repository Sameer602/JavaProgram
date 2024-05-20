package com.jtc.array;

public class MissingElementInArray {
	
	  public static void main(String[] args) {
		  
		  int a[] = {1,2,3,4,6};
		 /* 
		  int expectedLength = a.length+1;
		  
		  int totalSum = (expectedLength*(expectedLength+1))/2;
		//  System.out.println(totalSum);
		  int sum =0;
		  for(int i=0;i<a.length;i++) {
			  sum = sum + a[i];
		  }
		  System.out.println("Missing No is::"+(totalSum-sum));
		  */
		  int sum1 = 0;
		   for(int i=0;i<a.length;i++) {
			   sum1 = sum1 + a[i];
		   }
		   System.out.println(sum1);
		   
		   int sum2=0;
		   for(int i=0;i<=6;i++) {
			   sum2 = sum2 + i;
		   }
		   System.out.println(sum2);
		   System.out.println("Missing No is ::"+(sum2-sum1));
	}

}
