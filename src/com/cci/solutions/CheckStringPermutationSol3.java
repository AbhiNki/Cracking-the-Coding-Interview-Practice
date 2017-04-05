package com.cci.solutions;

import java.util.Scanner;

public class CheckStringPermutationSol3 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first string:");
		String string1= sc.nextLine();
		System.out.println("Enter second string:");
		String string2=sc.nextLine();
		System.out.println(permutation(string1,string2));
	}
	public static boolean permutation(String string1, String string2)
	{
		if(string1.length()!=string2.length())
		{
			return false;
		}
		
		int[] c_int =new int[128];
		for(char c:string1.toCharArray())
		{
			c_int[c]++;
		}
		
		for(char c: string2.toCharArray())
		{
			c_int[c]--;
			if(c_int[c]<0)
				return false;
		}
		return true;
	}

}
