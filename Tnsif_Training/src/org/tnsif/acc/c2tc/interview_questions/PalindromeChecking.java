package org.tnsif.acc.c2tc.interview_questions;
import java.util.Scanner;


public class PalindromeChecking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int rev=0, temp=n;
		
		while (n!=0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
	}
		if (temp == rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");


    }
}