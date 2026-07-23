package org.tnsif.acc.c2tc.oops;

public class Human {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Human obj=new Human();
		obj.setName("neha");
		obj.setAge(26);
		System.out.println(obj.getName());	
		System.out.println(obj.getAge());
		
		obj.setName("yashu");
		obj.setAge(20);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
	

	}

}
