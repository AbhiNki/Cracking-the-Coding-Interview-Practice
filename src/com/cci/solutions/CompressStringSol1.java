package com.cci.solutions;

import java.util.Scanner;
/*aaabbbcczzzz= a3b3c2z4*/

public class CompressStringSol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to compress");
		String string =sc.nextLine();
		StringBuilder compressed = new StringBuilder();
		int consecutive =0 ;
		for(int i=0;i<string.length();i++)
		{
			consecutive++;
			if(i+1>=string.length() || string.charAt(i) != string.charAt(i+1))
			{
				compressed.append(string.charAt(i));
				compressed.append(consecutive);
				consecutive=0;
			}
		}
		System.out.println(compressed.length()<string.length()?compressed.toString():string);

	}

}
