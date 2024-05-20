package com.ArrayKodnest;

import java.util.Arrays;
import java.util.Scanner;

public class CopyMethodArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size of  Array");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Sorted Array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Array");
		for(int a : arr)
		{
			System.out.print(a+" ");
		}
		int[] a=Arrays.copyOf(arr, 4);
		System.out.println();
		System.out.println("Copy Array");
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
	}

}
