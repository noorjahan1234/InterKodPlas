package com.ArrayKodnest;

import java.util.Scanner;

public class INSERTTHEELEMEN {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		int arr[]=new int[sc.nextInt()];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("Enter the index");
		int index=sc.nextInt();
		System.out.println("Ensert the element");
		int elem=sc.nextInt();
		elem=arr[index];
		for(int i=arr.length; i>index; i--)
		 {
		 arr[i]=arr[i-1];
		 }
		 arr[index] = elem;
		 for(int x : arr)
		 {
		 System.err.print(x+" ");
		 }
	}
}
