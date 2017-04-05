//Program to check if one string is permutation of other
package com.cci.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class CheckStringPermutationSol2 {
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first string:");
		String string1= sc.nextLine();
		System.out.println("Enter second string:");
		String string2=sc.nextLine();
		System.out.println(permutation(string1,string2));
	}
	static boolean permutation(String string1, String string2)
	{
		if(string1.length()!=string2.length())
		{
			return false;
		}
		else
			return sort(string1).equals(sort(string2));
	}
	static String sort(String string)
	{
		char[] content= string.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
}
