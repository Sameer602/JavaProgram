package com.jtc.array;

public class ElementOnceInArray {
	
	public static void main(String[] args) {
		
		int a[] = {5,3,4,5,2,3,4};
		
		int res = a[0];
		
		for(int i=1;i<a.length;i++) {
			res=res^a[i];
		}
		System.out.println("Element Present Once In Array::"+res);
	}

}
