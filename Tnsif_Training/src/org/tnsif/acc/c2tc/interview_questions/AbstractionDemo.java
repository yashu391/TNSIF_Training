package org.tnsif.acc.c2tc.interview_questions;

abstract class dog{
	void  eat(){
		System.out.println("dog eating biscuits");
	}
	abstract void sound();
}

  class animal extends dog{
	  @Override
	void sound() {
	 System.out.println("dog barks bow bow ");

	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		animal obj= new animal();
		obj.eat();
		obj.sound();
		
		
	}

}
