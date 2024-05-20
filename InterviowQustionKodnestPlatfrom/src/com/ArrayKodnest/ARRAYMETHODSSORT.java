package com.ArrayKodnest;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAYMETHODSSORT {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int arr[]=new int[sc.nextInt()];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		//array sort method
		Arrays.sort(arr);
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
	}
}
