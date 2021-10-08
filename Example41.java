package com.bitlabs.corejava;

import java.util.Scanner;

public class Example41 {
	

		public static void main(String[] args) 
		{
			int i, j, count,sum = 0; 
			
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
			    	 sum=sum+i;
			    }
			}
			System.out.println("the sum of prime numbers is  "+sum);
		}
	

}
