package com.bitlabs.corejava;

import java.util.Scanner;

public class Example61 {
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter size of an array: ");
	        int size = sc.nextInt();
	        int arr[] = new int[size];
	        System.out.println("Enter array elements: ");
	        for(int i=0;i<size;i++) {
	            arr[i] = sc.nextInt();
	        }
	        int f[] = new int [arr.length];  
	        int v = -1;  
	        for(int i = 0; i < arr.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < arr.length; j++){  
	                if(arr[i] == arr[j]){  
	                    count++;  
	                    f[j] = v;  
	                }  
	            }  
	            if(f[i] != v) {
	                f[i] = count;  
	            }
	        }  
	        System.out.println("Frequency of array elements: ");  
	        for(int i = 0; i < f.length; i++){  
	            if(f[i] != v)  {
	                System.out.println("  " + arr[i] + "  " + f[i]);  
	            }
	        }
	    }
	}

