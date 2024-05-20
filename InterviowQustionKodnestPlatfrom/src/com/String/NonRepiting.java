package com.String;

import java.util.Scanner;

public class NonRepiting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String name");
		String str=sc.nextLine();
		int[] nonrep=new int[256];
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			nonrep[i]++;
		}
		
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
		if(nonrep[ch]==1)
		{
			System.out.println(ch+"yes");
		}
		
		else
		{
			System.out.println(ch+ "No");
		}
		}
	}

}
