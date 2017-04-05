//Program to check all the chars in a string are unique, Given the chars are ASCII format
package com.cci.solutions;

import java.util.Scanner;

public class UniqueCharInStringSol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the STRING to check:");
		String string = sc.nextLine();
		
		if(string.length() > 128)
			System.out.println("no unique chars: base condition");
		
		boolean[] char_to_set = new boolean[128];
		for(int c = 0;c < string.length();c++)
		{
			int val = string.charAt(c);
			if(char_to_set[val])
			{
				System.out.println("no unique chars: check condition");
				System.exit(0);
			}
			else
				char_to_set[val]= true;
		}
		System.out.println("all unique chars!");

	}

}
