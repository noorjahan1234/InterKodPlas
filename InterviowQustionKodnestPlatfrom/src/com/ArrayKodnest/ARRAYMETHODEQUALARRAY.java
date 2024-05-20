package com.ArrayKodnest;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAYMETHODEQUALARRAY {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int arr1[]=new int[sc.nextInt()];
		int arr2[]=new int[arr1.length];
		System.out.println("Sorted Array First");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Sorted Array Second");
		for(int i=0; i<arr2.length; i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("First array");
		for(int a : arr1)
		{
			System.out.print(a+" ");
		}
		System.out.println("Second array");
		for(int a : arr2)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		boolean arr=Arrays.equals(arr1, arr2);
		System.out.println("Equal are array: "+arr);
		
//		if(arr1==arr2)
//		{
//			System.out.println("equal");
//		}
//		else {
//			System.out.println("Not");
//		}
	}

}
