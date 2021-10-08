package com.bitlabs.corejava;

public class Exmaple2 {
public static void main(String[] args) {
		
		 char ch='A';
		for(int i=1;i<=14;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
				}
			System.out.println();
			ch='A';
		}		
		}
}
