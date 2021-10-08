package com.bitlabs.corejava;

import java.util.Scanner;

public class Example64 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Length of the string is: " +str.length());
        System.out.println("Enter second string: ");
        String str1 = sc.nextLine();
        String s = str.concat(str1);
        System.out.println("Concat of string: " + s);
    }

}
