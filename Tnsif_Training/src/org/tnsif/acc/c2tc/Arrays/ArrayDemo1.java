package org.tnsif.acc.c2tc.Arrays;

public class ArrayDemo1 {
	public static void main(String[]args) {
		//static value
		int nums[]= {5,6,7,8};
		System.out.println(nums[2]);
		nums[2]=3;
		System.out.println(nums[2]);
		
		//dynamic value
		int num[]=new int[4];
		num[0]=2;
		num[1]=4;
		num[2]=6;
		num[3]=5;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		
		//using loop
		for (int i=0;i<3;i++)
			System.out.println(num[i]);
		
	}

}