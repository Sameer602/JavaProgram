package com.jtc.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Srt1 {
	
	public static void main(String[] args) {
		
		Student s1 =new Student("Ram",9,25,6000.50);
		Student s2 =new Student("Vivek",9,25,6000.50);
		Student s3 =new Student("Abhishek",9,25,6000.50);
		Student s4 =new Student("Bittu",9,25,6000.50);
		Student s5 =new Student("Tarun",9,25,6000.50);
		
		List<Student> students = Arrays.asList(s1,s2,s3,s4,s5);
		System.out.println("======Object Before Sorting======");
		for(Student s :students) {
			System.out.println(s);
		}
		//Logic
		//Collections.sort(students, (o1,o2)->o1.getSname().compareTo(o2.getSname()));
		/*Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
			
				return o1.getSname().compareTo(o2.getSname());
			}
			
		});
		*/
		Collections.sort(students, new StudentComparator());
		
		System.out.println("======Object After Sorting=======");
		for(Student s :students) {
			System.out.println(s);
		}
	}

}
class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getSname().compareTo(o2.getSname());
	}
	
}
