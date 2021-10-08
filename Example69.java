package com.bitlabs.corejava;

import java.util.Scanner;

public class Example69 {
	 public static void main(String args[]) {
	        String reverse= "";
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter a string:" );
	        String str = sc.nextLine();
	        int length = str.length();   
	        for ( int i = length - 1; i >= 0; i-- ) {
	            reverse = reverse + str.charAt(i);  
	        }
	        if (str.equals(reverse)) {
	            System.out.println("Palindrome.");  
	        }
	        else {  
	            System.out.println("Not a Palindrome.");   
	        }
	    }

}
