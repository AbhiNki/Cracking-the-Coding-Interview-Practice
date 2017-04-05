package com.cci.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckStringPermutationSol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter first string");
		String string1 = sc.nextLine();
		System.out.println("Enter second string");
		String string2 = sc.nextLine();


		List<String> permuteList =permute(string1);
		System.out.println(permuteList);
		
		if(permuteList.contains(string2))
		{
			System.out.println(string2+" is a permutation of "+string1);
		}
		else
			System.out.println(string2+" is not permutation of "+string1);
			
	}
	
	public static List<String> permute(String string1 )
	{
		List<String> resultList =new ArrayList<String>();
		if(string1.length()==1)
		{
			resultList.add(string1);
		}
		else
			if(string1.length() > 1)
			{
				int lastindex = string1.length()-1;
				String last = string1.substring(lastindex);
				String rest = string1.substring(0, lastindex);
				resultList = merge(permute(rest),last);
			}
		
		return resultList;
	}
	public static List<String> merge(List<String> list, String c)
	{
		List<String> res = new ArrayList<String>();
		for(String s: list)
		{
			for(int i=0;i<=s.length();++i)
			{
				String ps = new StringBuffer(s).insert(i, c).toString();
				res.add(ps);
			}
		}
		return res;
	}

}
