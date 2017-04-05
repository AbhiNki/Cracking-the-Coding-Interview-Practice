package com.cci.solutions;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter row value");
		int row = sc.nextInt();
		System.out.println("Enter column value");
		int column = sc.nextInt();
		int[][] matrix = new int[row][column];
		
		System.out.println("start entering matrix values row wise");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j <column;j++)
			{
				System.out.println("enter a value");
				matrix[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("The matrix is as follows:");
		for(int i=0; i<row;i++)
		{
			for(int j=0; j<column;j++)
			{
				System.out.print(matrix[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("In place rotation:"+rotate(matrix));
		System.out.println("The rotated matrix is as follows:");
		for(int i=0; i<row;i++)
		{
			for(int j=0; j<column;j++)
			{
				System.out.print(matrix[i][j]+"   ");
			}
			System.out.println();
		}
	}
	static boolean rotate(int[][] matrix)
	{
		if(matrix.length==0 || matrix.length != matrix[0].length)
			return false;
		int n = matrix.length;
		System.out.println(n);
		System.out.println(n/2);
		for(int layer =0;layer < n/2;layer++)
		{
			int first = layer;
			int last = n-1-layer;
			for(int i=first;i<last;i++)
			{
				int offset = i-first;
				//save top
				int top = matrix[first][i];
				//left to top
				matrix[first][i] = matrix[last-offset][first];
				//bottom to left
				matrix[last-offset][first] = matrix[last][last-offset];
				//right to bottom
				matrix[last][last-offset]=matrix[i][last];
				//top to right
				matrix[i][last]=top;
			}
		}
		return true;
	}

}
