package com.Kodnest;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterthe name");
		String s1=sc.nextLine();
		System.out.println("Enter the second");
		String s2=sc.nextLine();
		Bank b=new Bank(s1,s2);
		System.out.println(b.getS1());
		System.out.println(b.getS2());
		if(s1==s2)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
	}

}
