package com.bitlabs.corejava;

import java.util.Scanner;

//. Write a C program to find sum of all odd numbers between 1 to n.
public class Example24 {
	public static void main(String[] args)   
	{  
		Scanner sc= new Scanner(System.in);
	int i,  oddsum = 0;
	System.out.println("enter the number:");
	int num=sc.nextInt();
	 for(i = 0; i <= num ; i++){
         if((i%2) == 1){
             oddsum += i;
         }
     }
  
	System.out.println("Sum of odd Numbers is = " + oddsum);  

}
}