package com.bitlabs.corejava;

import java.util.Scanner;

public class Example39 {
	public static void main(String args[]){  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		boolean flag=false;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("the given number is prime number");
		else
			System.out.println("the given number is not prime number");
	}
		
}
