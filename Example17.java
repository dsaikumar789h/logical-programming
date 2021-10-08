package com.bitlabs.corejava;

import java.util.Scanner;

public class Example17 {
	public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter basic salary:");
		double basic=sc.nextDouble();
    double gross,da,hra;
    if(basic <=10000)
    {
        da = basic * 0.8;
        hra = basic * 0.2;
        gross = basic + da + hra;
        System.out.println("The hra is :"+hra);    
        System.out.println("the da is:"+da);
        System.out.println("the gross salary is :"+gross);
    }
            
        else if(basic <=20000)
    {
        da = basic * 0.9;
        hra = basic *0.25;
        gross = basic + da + hra;
        System.out.println("The hra is :"+hra);    
        System.out.println("the da is:"+da); 
        System.out.println("the gross salary is :"+gross);
    }
    else
    {
        da = basic * 0.95;
        hra = basic * 0.3;
        gross = basic + da + hra;
        System.out.println("The hra is :"+hra);    
        System.out.println("the da is:"+da); 
        System.out.println("the gross salary is :"+gross);
    }
   
}
}

