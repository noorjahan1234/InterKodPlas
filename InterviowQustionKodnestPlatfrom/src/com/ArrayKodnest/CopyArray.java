package com.ArrayKodnest;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int arr[]=new int[5];
//		int arr1[]=new int[arr.length];
//		for(int i=0; i<5; i++)
//		{
//			arr[i]=sc.nextInt();
//		}
		int arr[]= {12,21,32};
		int arr1[]=new int[arr.length];
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		System.out.println("Copy array");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=arr[i];
			System.out.println("Element "+(1+i)+": "+arr[i]);
		}
	}

}
