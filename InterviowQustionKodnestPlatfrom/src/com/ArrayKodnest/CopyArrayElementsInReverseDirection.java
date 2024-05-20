package com.ArrayKodnest;

import java.util.Scanner;

public class CopyArrayElementsInReverseDirection {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int arr[]=new int[sc.nextInt()];
		int arr1[]=new int[arr.length];
		System.out.println("Storing the array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int a: arr)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		for(int i=arr1.length-1; i>=0; i--)
		{
			arr1[i]=arr[i];
			System.out.println(arr1[i]);
		}
	}
}
