package com.bitlabs.corejava;

import java.util.Scanner;

public class Example20 {
	public static void main(String[] args)
	{
		
		int i =1;

		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter the value n : ");

		int n = sc.nextInt();

		System.out.println("Numbers are : ");

		while(i<=n)
		{
			System.out.print(i+" ");
			i++;
		}
	}

}
