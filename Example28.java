package com.bitlabs.corejava;

import java.util.Scanner;

public class Example28 {
	public static void main(String args[]) 
    {   Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int sum;
        int number = sc.nextInt();
        int first = 0;
        int last = 0;
 
        last = number%10;
        System.out.println("Last digit: "+last);
 
        while(number!=0) {
            first = number%10;
            number /= 10;
        }
        System.out.println("First digit: "+first);
        System.out.println("the  sum of First and Last digits: "+(sum=first+last));
        
    }

}
