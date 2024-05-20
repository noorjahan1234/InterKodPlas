package com.String;

import java.util.Scanner;

public class ConvertUppetoLower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String name");
		String str=sc.nextLine();
	
		char[] ch=str.toCharArray();
		for(int i=0; i<ch.length; i++)
			{
			if(ch[i]>='A' && ch[i]<='Z') {
				int itme=ch[i];
				itme=itme+32;
				ch[i]=(char) itme;
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				int itme=ch[i];
				itme=itme-32;
				ch[i]=(char) itme;
			}
			}
			String s=new String(ch);
			System.out.println(s);
		
	}

}
