package com.bitlabs.corejava;

import java.util.Scanner;

public class Example50 {
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter array size: ");
	        int size = sc.nextInt();
	        int arr[] =new int[size];
	        System.out.println("ENter array elements: ");
	        for(int i=0;i<size;i++) {
	            arr[i] = sc.nextInt();
	        }
	        int j=0;
	        while(j < arr.length) {
				if(arr[j] < 0) {
					System.out.format("%d ", arr[j]);
				}
				j++;
			}
	    }
}
