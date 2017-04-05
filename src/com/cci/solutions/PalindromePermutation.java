package com.cci.solutions;

import java.util.Scanner;

public class PalindromePermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String string = sc.nextLine();
		System.out.println("The string permutation is a palindrome :"+isPermutationOfPalindrome(string));

	}
	static boolean isPermutationOfPalindrome(String string)
	{
		int[] hashTable = buildCharFrequency(string);
		
		return checkMaxOneOdd(hashTable);
	}
	static boolean checkMaxOneOdd(int[] hashTable)
	{
		boolean foundOdd =false;
		for(int count : hashTable)
		{
			if(count%2==1)
			{
				if(foundOdd)
					return false;
				foundOdd = true;
			}
			
		}
		
		return true;
	}
	static int[] buildCharFrequency(String string)
	{
		int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		for(char c: string.toCharArray())
		{
			int x =getCharNumber(c);
			if(x!= -1)
			{
				table[x]++;
			}
		}
		return table;
	}
	static int getCharNumber(char c)
	{
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if( a<= val && val <=z)
		{
			return val-a;
		}
		return -1;
	}

}
