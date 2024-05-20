package com.String;

public class SpacialChar {

	public static void main(String[] args) {
		String str="i am learner";
		char ch[]=str.toCharArray();
		int left=0;
		int right=ch.length-1;
		while(left<right)
		{
			if(ch[left]!=' ' && ch[right]!=' ')
			{
				char temp=ch[left];
				ch[left]=ch[right];
				ch[right]=temp;
				left++;
				right--;
			}
		
		else if(ch[left]==' ')
		{
			left++;
		}
		else if(ch[right]==' ') {
			right++;
		}
		}
		System.out.println(ch);
	}

}
