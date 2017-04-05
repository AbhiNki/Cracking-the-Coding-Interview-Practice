package com.cci.solutions;

import java.util.Scanner;

public class MatrixNN {

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

	}

}
