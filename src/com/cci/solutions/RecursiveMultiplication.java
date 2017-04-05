package com.cci.solutions;

public class RecursiveMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 25;
		
		int bigger = a < b?b:a;
		int smaller = a < b? a:b;
		
		int result = productHelper(smaller, bigger);
		System.out.println("result :"+result);
	}
	
	public static int productHelper(int smaller, int bigger)
	{
		if(smaller == 0)
			return 0;
		else if(smaller == 1)
			return bigger;
		
		int s = smaller/2; //divide by 2
		System.out.println(s);
		
		int halfProduct = productHelper(s, bigger);
		
		if(smaller % 2 == 0)
		{
			return halfProduct + halfProduct;
		}
		else
			return halfProduct + halfProduct + bigger;
	}

}
