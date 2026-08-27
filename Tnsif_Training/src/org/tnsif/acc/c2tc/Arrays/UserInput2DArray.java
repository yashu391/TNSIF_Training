package org.tnsif.acc.c2tc.Arrays;
import java.util.Scanner;

public class UserInput2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of row ");
		int row=sc.nextInt();
		System.out.println("Enter No of column ");
		int col=sc.nextInt();
		
		int MultiDim[][]=new int[row][col];
		
		for(int i=0;i<row;i++) {  
			for(int j=0;j<col;j++) {
				MultiDim[i][j]=(i+1)*(j+1);
				
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(MultiDim[i][j]+ " ");
			}
		System.out.println();	
		sc.close();
	}
	}
}