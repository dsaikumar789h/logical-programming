package com.bitlabs.corejava;

import java.util.Scanner;

public class Example8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num =sc.nextInt();
	if(num % 2 == 0)
        System.out.println("the given number is even");
    else
        System.out.println("the given number is odd");
}

}
