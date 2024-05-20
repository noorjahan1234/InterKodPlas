package com.String;

public class ReverseStringName {

	public String findReverse(String str) {
		String[] s1=str.split("");
		for(int i=0; i<s1.length; i++)
		{
			char[] s2=s1[i].toCharArray();
			String revstr="";
			for(int j=s2.length-1; j>=0; j--)
			{
				revstr=revstr+s1[i];
			}
			s1[i]=revstr+" ";
		}
		String news="";
		for(int i=0; i<s1.length; i++)
		{
			news=news+s1[i];
		}
		return news;
	}

}
