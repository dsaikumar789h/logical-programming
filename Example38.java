package com.bitlabs.corejava;

import java.util.Scanner;

public class Example38 {
	public static void main(String args[]){  
		Scanner sc=new Scanner(System.in);
		  int i,fact=1;  
		  System.out.println("Input number to find factorial: ");
		    int number =sc.nextInt();  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("the factorial of a given number is: "+fact);    
		 }  
		}  
