package com.java.shashank;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String text=sc.nextLine();
		
		

	}
	static String reverseString(String text)
	{
		String[] words= text.split(" ");
		String revString="";
		for(String word: words)
		{
			StringBuilder sb=new StringBuilder(word);
			revString=revString+sb.reverse()+"";
			
		}
		return revString;
	}

}
