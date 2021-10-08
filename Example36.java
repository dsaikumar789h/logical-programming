package com.bitlabs.corejava;

import java.util.Scanner;

public class Example36 {
	public static void main(String[] args) 
	{
		int number, i, exponent;
		long power = 1;
		 Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		
		System.out.print(" Please Enter the Exponent Value : ");
		exponent = sc.nextInt();	
		
		for(i = 1; i <= exponent; i++)
		{
			power = power * number;
		}
		System.out.println("the power of given number is :  " + power);
	}
}

