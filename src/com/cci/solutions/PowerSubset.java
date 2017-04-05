package com.cci.solutions;

import java.util.ArrayList;

public class PowerSubset {

	public static void main(String[] args) {
		
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		ArrayList<ArrayList<Integer>> powerSet = getSubsets(set, 0);
		
		for(ArrayList<Integer> sets: powerSet)
		{
			System.out.print(sets.toString());
		}
		

	}
	
	public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int Index)
	{
		ArrayList<ArrayList<Integer>> allsubsets;
		if(set.size()==Index)
		{
			allsubsets = new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>());
		}
		else
		{
			allsubsets = getSubsets(set, Index+1);
			int item = set.get(Index);
			ArrayList<ArrayList<Integer>> moreSubset = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset : allsubsets)
			{
				ArrayList<Integer> newSubset = new ArrayList<Integer>();
				newSubset.add(item);
				newSubset.addAll(subset);
				moreSubset.add(newSubset);
			}
			allsubsets.addAll(moreSubset);
		}
		
		return allsubsets;
	}

}
