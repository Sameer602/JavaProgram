package com.jtc.beans;

public class Test {
	
	 public static void main(String[] args) {
		
	// MyInterface mi = ()->System.out.println("This is m1() method");
		 MyInterface mi = Demo1::m2;
	      mi.m1();
	}

}
