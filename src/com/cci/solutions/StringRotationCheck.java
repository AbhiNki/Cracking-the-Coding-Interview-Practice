package com.cci.solutions;

import java.util.Scanner;

public class StringRotationCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =new Scanner(System.in);
		System.out.println("enter first string");
		String string1 = sc.nextLine();
		System.out.println("enter second string");
		String string2 = sc.nextLine();
		
		System.out.println("Is rotation: "+isRotation(string1, string2));

	}
	static boolean isRotation(String string1, String string2)
	{
		int str1len = string1.length();
		int str2len = string2.length();
		
		if(str1len == str2len && str1len > 0)
		{
			String concatedSTRS = string1+string2;
			if(concatedSTRS.contains(string2))
				return true;
		}
		return false;
	}

}
