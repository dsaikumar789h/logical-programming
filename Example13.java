package com.bitlabs.corejava;

import java.util.Scanner;

public class Example13 {

	public static void main(String args[]){
	    char ch;
	 Scanner sc=new Scanner(System.in); 
	  
	    
	System.out.println("Enter the character  ");
	ch=sc.next().charAt(0);
	if(ch>='A' && ch<='Z') {
	    System.out.println("the given character is upper");
	}
	else if(ch>='a' && ch<='z') {
	    System.out.println(" the given character is a lower  ");
	}
	else
	{
	    System.out.println("the given character is not alphabet");
	}
	}

}
