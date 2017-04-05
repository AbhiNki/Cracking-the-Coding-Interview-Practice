package com.cci.solutions;

import java.util.Arrays;
import java.util.Scanner;

//1 step, 2 step or 3 step hopping at a time
public class NoOfSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int totalNoOfWays = memoCountWays(n);
		System.out.println(totalNoOfWays);

	}
    public static int countWays(int n)
    {
    	if(n<0)
    		return 0;
    	else if(n==0)
    		return 1;
    	else
    		return countWays(n-1)+countWays(n-2)+countWays(n-3);
    	
    }
    public static int memoCountWays(int n)
    {
    	int[] memo =new int[n+1];
    	Arrays.fill(memo, -1);
    	return memoCountWays(n, memo);
    }
    public static int memoCountWays(int n, int[] memo)
    {
    	if(n < 0)
    		return 0;
    	else if(n== 0)
    		return 1;
    	else if(memo[n] > -1)
    		return memo[n];
    	else
    		memo[n] = memoCountWays(n-1,memo)+memoCountWays(n-2, memo)+memoCountWays(n-3, memo);
    	return memo[n];
    }
}
