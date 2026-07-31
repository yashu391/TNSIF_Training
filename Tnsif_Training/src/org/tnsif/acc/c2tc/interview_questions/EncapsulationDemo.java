package org.tnsif.acc.c2tc.interview_questions;
class BankAccount{

private String accoundHolder;
private double balance;

public void setAccoundHolder(String name) {
	accoundHolder = name;
}

public String getAccoundHolder() {
	return accoundHolder;
}
public void setAmount(double amount) {
	if(amount >= 0)
        balance = amount;
    else
        System.out.println("Invalid Balance");
	
}

public double getAmount() {
	return balance;
}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		 BankAccount obj = new BankAccount();
		 obj.setAccoundHolder("Yashaswini N");
		 obj.setAmount(5000.00);
		 System.out.println(obj.getAccoundHolder());
		 System.out.println(obj.getAmount());

	}
	

	}


