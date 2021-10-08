package com.bitlabs.corejava;

import java.util.Scanner;

public class Example16 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter five subject marks:");
	System.out.print("enter physics marks:");
	double phy=sc.nextDouble();
	System.out.print("enter Chemistry marks:");
	double che=sc.nextDouble();
	System.out.print("enter Biology marks:");
	double bio=sc.nextDouble();
	System.out.print("enter Mathematics marks:");
	double math=sc.nextDouble();
	System.out.print("enter Computer marks:");
	double com=sc.nextDouble();
	double total=phy+che+bio+math+com;
	double Percentage=(total/100)*100;
	if(Percentage>=90)
	{
	System.out.print("Grade A");
	}
	else if(Percentage >= 80)
	{
	System.out.print("Grade B");
	}
	else if(Percentage >= 70)
	{
	System.out.print("Grade C");
	}
	else if(Percentage >= 60)
	{
	System.out.print("Grade D");
	}
	else if(Percentage >= 40)
	{
	System.out.print("Grade E");
	}
	else
	{
	System.out.print("Grade F");
	}


	}


}
