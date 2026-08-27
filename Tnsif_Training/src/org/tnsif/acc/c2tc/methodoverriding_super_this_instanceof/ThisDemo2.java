package org.tnsif.acc.c2tc.methodoverriding_super_this_instanceof;

class ProductBottle{
	double price;
	
	ProductBottle(double price){  //constructor
		this.price=price;
	}
	double calculateDiscount() {
		return this.price*0.10;
	}
	double calculateFinalPrice() {
		return this.price-this.calculateDiscount();
	}
	
}
public class ThisDemo2 {
	public static void main(String[]args) {
		ProductBottle product=new ProductBottle(400.0);
		System.out.println("Final Price:"+product.calculateFinalPrice());
	}

}