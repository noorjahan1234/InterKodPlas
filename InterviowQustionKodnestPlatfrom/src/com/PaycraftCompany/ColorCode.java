package com.PaycraftCompany;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorCode {

	public static void main(String[] args) {
		String color="rgb(0,0,0)";
		String str=colorValid(color);
		System.out.println(str);
	}

	private static String colorValid(String color) {
		Pattern p=Pattern.compile("rgb\\(\\s*\\d{01}\\s*,\\s*\\d{01}\\s*,\\s*\\d{01}\\s*\\)");
		Matcher m=p.matcher(color);
		if(m.matches()) {
			return "Ivalid";
		}
	return "valid";
	}
}
