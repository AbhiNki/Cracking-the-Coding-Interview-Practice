package com.cci.solutions;

import java.util.Scanner;

public class PalindromePermutationSol2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String:");
		String string = sc.nextLine();
		
		System.out.println("The string permutation is a palindrome:"+isPermutationPalindrome(string));

	}
	static boolean isPermutationPalindrome(String string)
	{
		int[] hashTable = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		int countOdd =0 ;
		for(char c : string.toCharArray())
		{
			int x = Character.getNumericValue('a')-Character.getNumericValue(c);
			if(x>=0)
			{
				hashTable[x]++;
				if(hashTable[x]%2==1)
					countOdd++;
				else
					countOdd--;
			}

		}
		
		return countOdd <= 1;
	}

}
