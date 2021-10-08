package com.bitlabs.corejava;

import java.util.Scanner;

public class Example40 {
	public static void main(String[] args) 
	{
		int i, j, count; 
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Prime Numbers  : ");	
		int n=sc.nextInt();
		for(i = 1; i <= n; i++)
		{
			count = 0;
		    for (j = 2; j <= i/2; j++)
		    {
		    	if(i % j == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && i!= 1 )
		    {
		    	System.out.print(i+ " ");
		    }  
		}
	}
}
	
