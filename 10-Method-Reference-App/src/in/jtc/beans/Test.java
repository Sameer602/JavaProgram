package in.jtc.beans;

public class Test {
	
	 public static void m2() {
		 System.out.println("This is m2() method");
	 }
	 
	 public static void main(String[] args) {
		 
		 MyInterface mi1 = ()->System.out.println("Hi I am from m1() method");
		 MyInterface mi2 = Test::m2;
		 mi1.m1();
		 mi2.m1();
		
	}
	 
	 @FunctionalInterface
	 interface MyInterface{
		 public void m1();
	 }

}
