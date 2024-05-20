package com.ArrayKodnest;

import java.util.Scanner;

public class Multiplay {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int arr1[][]=new int[sc.nextInt()][sc.nextInt()];
		int arr2[][]=new int[arr1.length][arr1.length];
		int arr3[][]=new int[arr1.length][arr1.length];
		System.out.println("Sorted Array");
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length; j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length; j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0; i<arr3.length; i++)
		{
			for(int j=0; j<arr3[i].length; j++)
			{
				arr3[i][j]=arr1[i][j]*arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
