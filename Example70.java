package com.bitlabs.corejava;

import java.util.Scanner;

public class Example70 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        int flag = 0,i=0;
        while(i < str.length())
		{
			if(str.charAt(i) ==  ch) {
				flag++;
				break;
			}
			i++;
		}
		if(flag == 0) {
		    System.out.println("No character is present");
		}
		else {
		    System.out.println("The First occurance of character " + ch + " at " + i + " position");
		}
	}
}
