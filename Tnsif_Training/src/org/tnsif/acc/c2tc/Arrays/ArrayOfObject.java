package org.tnsif.acc.c2tc.Arrays;
class Books{
	String title;
	String author;
	double price;
	
	public Books(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void display() {
		System.out.println("Title: "+title+ " Author: "+author+ "price: "+price);
	}
	
	
}
public class ArrayOfObject {

	public static void main(String[] args) {
		Books[] book=new Books[3];
		book[0]=new Books("java","Bhoomi",2000);
		book[1]=new Books("java","shree",5000);
		book[2]=new Books("java","Shreya",6000);
		
		for(Books book1:book) {
			book1.display();
			
		}
	}

}