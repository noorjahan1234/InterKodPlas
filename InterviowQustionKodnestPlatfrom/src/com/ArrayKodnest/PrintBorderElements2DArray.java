package com.ArrayKodnest;

import java.util.Scanner;

public class PrintBorderElements2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int arr[][]=new int[sc.nextInt()][sc.nextInt()];
		System.out.println("Stored the Array");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Before Array");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Clocwise Array");
//		for(int i=0; i<arr.length; i++)
//		{
//			System.out.print(arr[0][i]+" ");
//		}
//		for(int i=1; i<arr.length; i++)
//		{
//			System.out.print(arr[i][arr.length-1]+" ");
//		}
//		for(int i=arr.length-2; i>=0; i--)
//		{
//			System.out.print(arr[arr.length-1][i]+" ");
//		}
//		for(int i=arr.length-2; i>=1; i--)
//		{
//			System.out.print(arr[i][0]+" ");
//		}
//		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(i==0  || i==arr.length-1 || j==0 || j==arr.length-1)
				{
					System.out.print(arr[i][j]+" ");
				}			}
			//System.out.println();
		}
		
	}

}
