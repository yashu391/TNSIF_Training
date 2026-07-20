package org.tnsif.acce.c2tc.java;

public class VariableDemo {
	int price=10;
	void print()
	{
		String msg="hello";
		System.out.println(msg);
	}
static String message="Hello Students";
	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		System.out.println(obj.price);
		obj.print();
		System.out.println(message);

	}

}
