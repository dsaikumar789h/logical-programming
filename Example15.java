package com.bitlabs.corejava;

import java.util.Scanner;

public class Example15 {
	public static void main(String[] args)
	{
   Scanner sc = new Scanner(System.in);
    System.out.print("Input amount: ");
       int amt =sc.nextInt();
       int rem=0;
       if(amt>=100)
       {
    	   rem=amt%2000;
    	   amt=amt/2000;
    	   System.out.println("the no of 2000 notes: "+amt);
    	   amt=rem/500;
    	   rem=rem%500;
    	   System.out.println("the no.of 500 notes:"+amt);
    	   amt=rem/200;
    	   rem=rem%200;
    	   System.out.println("the no.of 200 notes:"+amt);
    	   amt=rem/100;
    	   System.out.println("the no.of 100 notes:"+amt);
    	   
    	   
       }
       

}
}
