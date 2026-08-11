package org.trsif.acc.c2tc.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Registerable student =new Student(12,"indu",20000,"java");
		Registerable student1 =new Student(12,"yashu",35000,"python");
		
		Object obj = new Object();
		 if (student instanceof Registerable) {
			 System.out.println("Student is registered for this course");
		 }
		 else {
			 System.out.println("student is not registerd  for this course");
		 }

	}

}
