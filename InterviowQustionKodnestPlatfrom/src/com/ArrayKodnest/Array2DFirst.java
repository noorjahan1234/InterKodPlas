package com.ArrayKodnest;

import java.util.Scanner;

public class Array2DFirst {

	static void findArray(int[][] arr, int size) {
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
		//return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		System.out.println("Stored the elements");
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Mobile Cost: ");
		findArray(arr, size);
		
	}
}