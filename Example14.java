package com.bitlabs.corejava;

import java.util.Scanner;

public class Example14 {
	public static void main(String[] args)
	{
	    int number;
   Scanner sc = new Scanner(System.in);
    System.out.print("Input number: ");
   number =sc.nextInt();
   if(number==1)
        System.out.println("the day is sunday");
   else if(number==2)
        System.out.println("the day is monday");
    else if(number==3)
        System.out.println("the day is tuesday");
    else if(number==4)
        System.out.println("the day is wednesday");
    else if(number==5)
        System.out.println("the day is thursday");
    else if(number==6)
        System.out.println("the day is friday");
    else if(number==7)
        System.out.println("the day is saturday");
    else
         System.out.println("please enter a valid number");



}
}