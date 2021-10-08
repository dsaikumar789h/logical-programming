package com.bitlabs.corejava;

import java.util.Scanner;

public class Example11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");

        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        {
            System.out.println("the given character is vowel");
        }
        else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
        {
            System.out.println( "the given character  is vowel");
        }
        else
        {
        	System.out.println( "the given character  is consonant");
    }
}
}


