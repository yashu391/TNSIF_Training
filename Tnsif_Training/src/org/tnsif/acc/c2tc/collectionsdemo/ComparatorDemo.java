package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person8
{
	String name;
	int age;
	
	public Person8(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	 void display()
	 {
		 System.out.println("Name :"+ name + " , Age :"+ age );
	 }

}

class NameComparator implements Comparator<Person8>
{

	@Override
	public int compare(Person8 p1, Person8 p2) {
		
		return p1.name.compareTo(p2.name);
	}
	
}

class AgeComparator implements Comparator<Person8>
{

	@Override
	public int compare(Person8 p1, Person8 p2) {
		
		return Integer.compare(p1.age,p2.age);
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
	
      List<Person8> people =new ArrayList<>();
      people.add(new Person8("Sushma",34));
      people.add(new Person8("Akash",25));
      people.add(new Person8("Hema",17));
      
      Collections.sort(people , new  NameComparator());
      System.out.println("Sorted by name");
      System.out.println();
      
      for(Person8 person:people)
      {
    	  person.display();
      }
      
      System.out.println();
      
      Collections.sort(people , new  AgeComparator());
      System.out.println("Sorted by age");
      System.out.println();
      
      for(Person8 person:people)
      {
    	  person.display();
      }
      
	}

}