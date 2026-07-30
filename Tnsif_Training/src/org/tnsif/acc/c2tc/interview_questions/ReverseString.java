package org.tnsif.acc.c2tc.interview_questions;

public class ReverseString {
	void reverse() {
        String str = "Hello World";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + rev);
    }

    // Main method
    public static void main(String[] args) {

        // Creating object
        ReverseString obj = new ReverseString();

        // Calling method
        obj.reverse();
    }
}