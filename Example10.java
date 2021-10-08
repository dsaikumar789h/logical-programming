package com.bitlabs.corejava;

import java.util.Scanner;

public class Example10 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char c = sc.next().charAt(0);
 
	if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
	{
		System.out.println("the given character  is  alphabet ");
	}
	else
	{
		System.out.println("the given character  is not alphabet ");
	}

}
}
