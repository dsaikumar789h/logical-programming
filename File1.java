package com.bitlabs.corejava;

import java.io.FileWriter;

public class File1 {
	public static void main(String args[]){  
		String str="my name is sai";
		try
		{
			FileWriter fw=new FileWriter("file2.txt");
			fw.write(str);
			fw.flush();
			System.out.println("data inserted successfully");
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
}
