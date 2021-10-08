package com.bitlabs.corejava;

import java.util.Scanner;

public class Example18 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter num:");
	int number=sc.nextInt();
	switch(number)
	{
	case 1 :System.out.print("sunday");
	break;
	case 2 :System.out.print("monday");
	break;
	case 3 :System.out.print("tueday");
	break;
	case 4 :System.out.print("wednesday");
	break;
	case 5 :System.out.print("thursday");
	break;
	case 6 :System.out.print("friday");
	break;
	case 7 :System.out.print("satday");
	break;
	}
	}

	}


