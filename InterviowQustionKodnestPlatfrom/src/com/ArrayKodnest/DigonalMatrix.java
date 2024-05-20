package com.ArrayKodnest;

import java.util.Scanner;

public class DigonalMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int arr[][]=new int[sc.nextInt()][sc.nextInt()];
		System.out.println("Stored the Element each array");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("After Digonal Matrix");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(i==j)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}

}
