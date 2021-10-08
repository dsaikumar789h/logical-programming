package com.bitlabs.corejava;

import java.util.Scanner;

public class Example44 {
	public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
       int n, count = 0, a, b, c, sum = 0;
       System.out.print("enter number:");
       int number = sc.nextInt();
       for(int i = 1; i <= number; i++)
       {
           n = i;
           while(n > 0)
           {
               b = n % 10;
               sum = sum + (b * b * b);
               n = n / 10;
           }
           if(sum == i)
           {
               System.out.print(i+" ");
           }
           sum = 0;
       }
   }

}
