package com.cci.solutions;

import java.util.Scanner;

public class NullifyRwoColumn {

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
		
		int[][] newMatrix=setZeros(matrix);
		System.out.println("The matrix is as follows:");
		for(int i=0; i<row;i++)
		{
			for(int j=0; j<column;j++)
			{
				System.out.print(newMatrix[i][j]+"   ");
			}
			System.out.println();
		}
	}
	static int[][] setZeros(int[][] matrix)
	{
		boolean[] row =new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(matrix[i][j]==0){
				row[i]=true;
				column[j]=true;
				}
			}
		}
		//nullify rows
		for(int i=0;i<row.length;i++)
		{
			if(row[i]) nullifyRow(matrix,i);
		}
		//nullify column
		for(int j=0;j<column.length;j++)
		{
			if(column[j]) nullifyColumn(matrix,j);
		}
		
		return matrix;
	}
	static void nullifyRow(int[][] matrix, int row)
	{
		for(int j=0;j<matrix[0].length;j++)
		{
			matrix[row][j]=0;
		}
	}
	static void nullifyColumn(int[][] matrix, int column)
	{
		for(int j=0;j<matrix.length;j++)
		{
			matrix[j][column]=0;
		}
	}


}
