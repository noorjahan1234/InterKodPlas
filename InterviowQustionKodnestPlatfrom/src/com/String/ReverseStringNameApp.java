package com.String;

import java.util.Scanner;

public class ReverseStringNameApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=sc.nextLine();
		StringBuffer sbf=new StringBuffer(str);
//		ReverseStringName res=new ReverseStringName();
//		System.out.println(res.findReverse(str));
		String[] s1=str.split("");
		for(int i=0; i<s1.length; i++)
		{
			char[] s2=s1[i].toCharArray();
			String revstr="";
			for(int j=s2.length-1; j>=0; j--)
			{
				revstr=revstr+s2[j];
			}
			s1[i]=revstr+"";
		}
		String news="";
		for(int i=0; i<s1.length; i++)
		{
			news=news+s1[i];
		}
		System.out.println(news);
	}

}
