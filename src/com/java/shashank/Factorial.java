package com.java.shashank;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		Factorial fobj=new Factorial();
		int fact=fobj.factorial(num);
		System.out.println("Factorial of a number is"+fact);
		

	}
	int factorial(int n)
	{
		int fact=1;
		for(int i=2;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
