package com.bitlabs.corejava;

import java.util.Scanner;

public class Example48 {
	 public static void main(String[] args) {
		  Scanner cs=new Scanner(System.in);
		  int  n, i;
		        System.out.println("Enter the Last number:");
		        n=cs.nextInt();
		    System.out.println("Strong numbers between 1-n are:");
		    for(i=1;i<=n;i++)
		      {
		       int num2=i;
		       int num1=i;
		       int sum=0;
		       int fact=1;
		      while(num1!=0)
		      {   fact=1;
		          int rem=num1%10;
		          num1=num1/10;
		          for(int j=1;j<=rem;j++)
		           fact=fact*j;
		          sum=sum+fact;
		      }
		      if(sum==num2)
		       System.out.println(i+" ");
		      }
	 }
}



