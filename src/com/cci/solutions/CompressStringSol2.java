package com.cci.solutions;

import java.util.Scanner;

public class CompressStringSol2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to compress");
		String string = sc.nextLine();
		System.out.println(compress(string));

	}
	static String compress(String string)
	{
		int finalLength = countCompression(string);
		if(finalLength >= string.length())
			return string;
		
		StringBuilder compressedString = new StringBuilder();
		int consecutive =0;
		for(int i=0;i<string.length();i++)
		{
			consecutive++;
			if(i+1 >= string.length() || string.charAt(i)!=string.charAt(i+1))
			{
				compressedString.append(string.charAt(i));
				compressedString.append(consecutive);
				consecutive=0;
			}
		}
		
		return compressedString.toString();
	}
	
	static int countCompression(String string)
	{
		int consecutive =0;
		int compressedLength =0;
		for(int i =0;i<string.length();i++)
		{
			consecutive++;
			if(i+1>=string.length() || string.charAt(i)!=string.charAt(i+1))
			{
				compressedLength+=1+String.valueOf(consecutive).length();
				consecutive =0;
			}
		}
		return compressedLength;
		
	}

}
