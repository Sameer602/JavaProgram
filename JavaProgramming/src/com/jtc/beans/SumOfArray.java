package com.jtc.beans;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int a[] = {5,2,7,9,6};
		int sum=0;
		/*
		for(int i=0; i<=a.length-1;i++) {
			sum = sum + a[i];
		}*/
		for(int val:a) {
			sum = sum +val;
		}
		System.out.println(sum);
		
	}

}
