package com.bitlabs.corejava;

import java.util.Scanner;

public class Example68 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String str = sc.nextLine();    
	        String rs = "";    
	        for(int i = str.length()-1; i >= 0; i--) {    
	            rs = rs + str.charAt(i);    
	        }
	        System.out.println("Original string: " + str);    
	        System.out.println("Reverse of given string: " + rs);    
	    }    

}
