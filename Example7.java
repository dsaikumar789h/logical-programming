package com.bitlabs.corejava;

import java.util.Scanner;

public class Example7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number:");
		int num =sc.nextInt();
		if(num%5==0 && num%11==0)
		{
			System.out.println("the given number is divisible by 5 and  11");
		}
		else
		{
			System.out.println("the given number is not divisible by 5 and  11");
		}
}
}
