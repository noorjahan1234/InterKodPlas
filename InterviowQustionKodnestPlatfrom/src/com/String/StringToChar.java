package com.String;

public class StringToChar {

	public static void main(String[] args) {
		String str="Noor";
		//String st="";
		char[] ch=str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			System.out.print(ch[i]+" ");
		}
	}
}
