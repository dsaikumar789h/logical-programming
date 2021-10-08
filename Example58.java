package com.bitlabs.corejava;

import java.util.Scanner;

public class Example58 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] =new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
	      int n = arr.length;
	      int i, j;
	      System.out.print("The array is: ");
	      for (i = 0; i < n; ++i)
	      System.out.print(arr[i] + " ");
	      System.out.print("\nThe distinct elements of above array are: ");
	      for (i = 0; i < n; i++) {
	         for (j = 0; j < i; j++)
	         if (arr[i] == arr[j])
	            break;
	         if (i == j)
	         System.out.print( arr[i] + " ");
	      }
	   }

}
