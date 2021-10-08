package com.bitlabs.corejava;

import java.util.Scanner;

public class Example6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number:");
		int a =sc.nextInt();
		if(a>0)
		{
			System.out.println("the number is positive");
		}
		else if(a<0)
		{
			System.out.println("the given number is negative");
		}
}
}
