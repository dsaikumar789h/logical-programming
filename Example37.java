package com.bitlabs.corejava;

import java.util.Scanner;

public class Example37 {
	public static void main(String[] args)
	{
	    int number;

    Scanner sc = new Scanner(System.in);
    System.out.println("Input number to find factors: ");
     number =sc.nextInt();
     for(int i=1;i<=number;i++)
     if(number%i==0)
     System.out.print(i+" ");
	}
}


