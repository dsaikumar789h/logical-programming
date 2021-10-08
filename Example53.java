package com.bitlabs.corejava;

import java.util.Scanner;

public class Example53 {
	public static void main(String args[]) {
        int evenc=0,oddc=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] =new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++) {
			if(arr[i] % 2 == 0) {
				evenc++;
			}
			else {
				oddc++;
			}
		}
	    System.out.println("Total number of even count: " + evenc + "and total number of odd count: " + oddc);
    }
}

