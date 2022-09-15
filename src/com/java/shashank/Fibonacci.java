package com.java.shashank;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("How many fibanocci series numbers");
		int num=sc.nextInt();
		displayFibanocciSeries(num);
		
		sc.close();
		

	}
	static void displayFibanocciSeries(int n)
	{
		int x=1,y=0,z=0,count=1;
		while(count<=n)
		{
			System.out.println(z+" ");
			z=x+y;
			x=y;
			y=z;
			count++;
		}
	}

}
