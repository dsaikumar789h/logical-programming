package com.bitlabs.corejava;

import java.util.Scanner;

public class Example5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number:");
		int a =sc.nextInt();
		System.out.println("enter 2nd number:");
		int b =sc.nextInt();
	if(a>b)
    {
       System.out.println("a is big");
    }
    else if(a==b)
    {
    	 System.out.println("both are same");
    	 
    }
    else 
    {

   	 System.out.println("b is big");
	}
}
}
