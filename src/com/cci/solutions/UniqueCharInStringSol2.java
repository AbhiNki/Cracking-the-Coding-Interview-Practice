//Check if he all the chars in a string are unique- in this case all lowers a-z
package com.cci.solutions;

import java.util.Scanner;

public class UniqueCharInStringSol2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string in lower case");
		String string = sc.nextLine();
		System.out.println(isUniqueChars(string));

	}

	private static boolean isUniqueChars(String string) {
		int checker = 0;
		for(int i=0;i<string.length();i++)
		{
			int val = string.charAt(i)-'a';
			System.out.println("char: "+string.charAt(i)+" | val: "+val);
			System.out.println("checker: "+checker +" |  (1<<val): "+ (1 << val));
			if((checker & (1 << val)) > 0)
              {
            	  return false;
              }
			checker |= (1 << val);
			System.out.println("checker:"+checker);
		}
		return true;
		// TODO Auto-generated method stub
		
	}

}
