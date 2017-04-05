package com.cci.solutions;

import java.util.Scanner;

public class OneEditAwaySol1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String One:");
		String string1 = sc.nextLine();
		System.out.println("Enter String Two:");
		String string2 = sc.nextLine();
		if(string1.length() == string2.length())
			System.out.println("Replace :"+oneEditReplace(string1, string2));
		else if(string1.length()+1 == string2.length())
			System.out.println("Insert :"+oneInsertRemove(string1, string2));
		else if(string1.length() -1 ==string2.length())
			System.out.println("Remove :"+oneInsertRemove(string2, string1));
		else
			System.out.println("Not a one edit away!");
	}
	static boolean oneEditReplace(String first, String second)
	{
		boolean foundDiff = false;
		for(int i=0;i<first.length();i++)
		{
			if(first.charAt(i)!=second.charAt(i))
			{
				if(foundDiff)
					return false;
				foundDiff = true;
			}
			
		}
		return true;
	}
	static boolean oneInsertRemove(String first, String second)
	{
		int index1 =0;
		int index2 =0;
		while(index1 < first.length() && index2 < second.length())
		{
			if(first.charAt(index1)!= second.charAt(index2))
			{
				if(index1!=index2)
				{
					return false;
				}
				index2++;
			}
			else{
				index1++;index2++;
			}
		}
		
		return true;
	}

}
