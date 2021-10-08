package com.bitlabs.corejava;

import java.util.Scanner;

public class Example55 {
	public static void main(String[] args) {        
            
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] =new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
     
   int arr2[] = new int[arr.length];    
       
   for (int i = 0; i < arr.length; i++) {     
       arr2[i] = arr[i];     
   }      
      
   System.out.println("Elements of original array: ");    
   for (int i = 0; i < arr.length; i++) {     
      System.out.print(arr[i] + " ");    
   }     
       
   System.out.println();    
       
      
   System.out.println("Elements of new array: ");    
   for (int i = 0; i < arr2.length; i++) {     
      System.out.print(arr2[i] + " ");    
   }     
} 
}