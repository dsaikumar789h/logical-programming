package com.bitlabs.corejava;

import java.util.Scanner;

public class Example22 {
	public static void main(String[] args)   
	{  
		Scanner sc= new Scanner(System.in);
	int i,  sum = 0;
	System.out.println("enter the number:");
	int num=sc.nextInt();
	 
	for(i = 1; i <= num; ++i)  
	{  
 
	sum = sum + i;  
	}  
	 
	System.out.println("Sum of  Natural Numbers is = " + sum);  
	}  
}
