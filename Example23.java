package com.bitlabs.corejava;

import java.util.Scanner;

// Write a java program to find sum of all even numbers between 1 to n.
public class Example23 {

		public static void main(String[] args)   
		{  
			Scanner sc= new Scanner(System.in);
		int i,  evensum = 0;
		System.out.println("enter the number:");
		int num=sc.nextInt();
		for(i = 1; i <= num; i++)
		{
			if(i % 2 == 0)
			{
				evensum = evensum + i; 
			}
			}
		System.out.println("Sum of even Numbers is = " + evensum);  
	
	}
}

