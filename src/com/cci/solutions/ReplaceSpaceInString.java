package com.cci.solutions;
//Replacing space char with %20
/*example "Mr John Smith    "
 * "Mr%20John%20Smith"
 * 
 */

import java.util.Scanner;

public class ReplaceSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String:");
	    String string = sc.nextLine();
	    System.out.println("Enter the true length:");
	    int trueLength = sc.nextInt();
	    char[] char_array = string.toCharArray();
	    replaceSpace(char_array, trueLength);
	}
	public static void replaceSpace(char[] char_array, int trueLength)
	{
		int spaceCount = 0, index, i=0;
		for(i=0;i<trueLength;i++)
		{
			if(char_array[i]==' '){
				spaceCount++;
			}
		}
		index = trueLength +spaceCount*2;
		if(trueLength < char_array.length)
			char_array[trueLength]='\0';
		for(i=trueLength-1;i>=0 ;i--)
		{
			if(char_array[i]==' ')
			{
				char_array[index-1]='0';
				char_array[index-2]='2';
				char_array[index-3]='%';
				index = index - 3;
			}
			else {

				index--;
			}
			
		}
		System.out.println(new String(char_array));
	}
	

}
