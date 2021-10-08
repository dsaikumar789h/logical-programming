package com.bitlabs.corejava;

import java.util.Scanner;

public class Example43 {
	 public static void main(String args[])
	 {
	 Scanner sc = new Scanner(System.in);
	 int n,c,remainder,sum=0;
	 System.out.println("Enter the number");
	 
	     n=sc.nextInt();
	            	c=n;
	               while(c!=0)
	    	       {
	 remainder=c%10;
	       sum=sum+remainder*remainder*remainder;
	         c=c/10;
	     }
	 
	 if(sum==n)
	         System.out.println(n+" is an Armstrong number");
	     else
	         System.out.println(n+" is not an Armstrong number");
	 }
	}


