package com.OOPInharitence;

import java.util.Scanner;

public class Main {

	
		public static void sortShapesByArea(Shape[] shapes) {
			System.out.println("Area: "+shapes);
		}
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the l");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double r=sc.nextDouble();
		double h=sc.nextDouble();
		double ba=sc.nextDouble();
		sortShapesByArea(shapes);
	}

}
