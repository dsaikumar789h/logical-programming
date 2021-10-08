package com.bitlabs.corejava;

import java.util.Scanner;

public class Example19 {
	public static void main(String[] args) 
	{
		double Amount, addcharge, totalamt;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter units : ");
		int units = sc.nextInt();
  
	  	if (units < 50)
	  	{
	        Amount = units * 2.60;
	  		addcharge = 25;  	
	  	} 
	  	else if (units <= 100)
	  	{
	  		
	  		Amount = 130 + ((units - 50 ) * 3.25);
	  		addcharge = 35; 	
	  	}
	  	else if (units <= 200)
	  	{
	  		Amount = 130 + 162.50 + ((units - 100 ) * 5.26);
	  		addcharge = 45; 	
	  	}
	  	else
	  	{
	  		
		   	Amount = 130 + 162.50 + 526 + ((units - 200 ) * 7.75); 
		   	addcharge = 55; 
		}
		
		totalamt = Amount +addcharge;
		System.out.println("the total is"+totalamt);
	}

}


