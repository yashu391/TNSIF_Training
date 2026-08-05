package org.tnsif.acc.c2tc.scannerclass_bufferreader;
import java.util.Scanner;
public class ScannerCharDemo {
	
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	 System.out.println("enter the string ");
	 char c =scan.next().charAt(1);
	 System.out.println("the second string " +c);
	 scan.close();
}
}
