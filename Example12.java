package com.bitlabs.corejava;

import java.util.Scanner;

public class Example12 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  character : ");
        char ch = sc.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

             System.out.println( "the given character is alphabet");

        } else if(ch >= '0' && ch <= '9') {

             System.out.println("the given character is digit");

        } else {

             System.out.println("the given character special character");
        }
    
    }

}
