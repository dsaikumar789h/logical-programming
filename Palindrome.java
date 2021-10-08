package com.bitlabs.corejava;

import java.util.Scanner;

public class Palindrome {
	 public void palindrome(){
	        boolean a=true;
	        Scanner s = new Scanner(System.in);
	        System.out.println("enter the value");
	        String str = s.nextLine();
	        for(int i=0;i<str.length()/2;i++){
	            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
	                a=false;
	                break;
	            }
	        }
	        if(a){
	            System.out.println("it  is palindrome");
	        }
	        else{
	            System.out.println("it is not palindrome");
	        }
	    }
	    public static void main(String args[]){
	        Palindrome obj = new Palindrome();
	        obj.palindrome();
	    }
	}

