package com.bitlabs.corejava;

import java.util.Scanner;

public class Example32 {
	public static void main(String[] args)   
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the given number");
	int number = sc.nextInt(); 
	int remainder;
			int reverse = 0;  
	while(number != 0)   
	{  
	remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
	}  

