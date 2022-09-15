package com.java.shashank;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number: ");
		int no1=sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int no2=sc.nextInt();
		System.out.println("Enter required operation[+,-,*,/]");
		char operator=sc.next().charAt(0);
		if(operator=='+' || operator=='-' || operator=='*' || operator=='/')
		{
		 int res=calculate(no1, no2, operator);
		 System.out.println(no1+" "+ operator+ no2+" = "+res);
		}
		else 
		{
			System.out.println("You have entered invalid operator... Please select from '+', '-', '*', '/' ");
		}
		
		sc.close();
		
	}
	static int calculate(int x, int y, char operator)
	{
		int res=0;
		switch(operator)
		{
		case '+':
			res=x+y;
			break;
		case '-':
			res=x-y;
			break;
		case '*':
			res=x*y;
			break;
		case '/':
			res=x/y;
			break;
			
		}
		return res;
		
	}

}
