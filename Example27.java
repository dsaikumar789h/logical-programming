package com.bitlabs.corejava;

import java.util.Scanner;

public class Example27 {
	public static void main(String args[]) 
    {   Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
        int number = sc.nextInt();
        int firstDigit = 0;
        int lastDigit = 0;
 
        lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);
 
        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }
        System.out.println("First digit: "+firstDigit);
    }
}

