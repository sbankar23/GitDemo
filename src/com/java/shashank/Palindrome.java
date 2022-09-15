package com.java.shashank;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String word=sc.next();
		if(isPalindrome(word))
		{
			System.out.println("Word is palindrome ");
		}
		else
		{
			System.out.println("Word is not palindrome");
		}

	}
	static boolean isPalindrome(String word)
	{
		int forwardIndex=0, backwardIndex=word.length()-1;
		while(forwardIndex<=backwardIndex)
		{
			char startChar=word.charAt(forwardIndex);
			char endChar=word.charAt(backwardIndex);
			if (startChar!=endChar) 
			{
				return false;
			}
			forwardIndex++;
			backwardIndex--;
		}
		return true;
		
	}

}
