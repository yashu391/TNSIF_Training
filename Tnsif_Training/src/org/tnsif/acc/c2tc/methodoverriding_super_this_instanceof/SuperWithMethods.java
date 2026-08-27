package org.tnsif.acc.c2tc.methodoverriding_super_this_instanceof;

class Payment1 
{
	void process()
	{
		System.out.println("Processing payment using Standard gateway");
	}
}

class Gpay extends Payment1
{
	void process()
	{
		System.out.println("Processsing payment via Google pay");
	}
	
	void CompleteTransaction()
	{
		super.process();
		process();
	}
}

public class SuperWithMethods {

	public static void main(String[] args) {
		Gpay obj=new Gpay();
		obj.CompleteTransaction();

	}

}