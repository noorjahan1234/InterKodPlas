package com.OOPInharitence;

public class Triangle extends Shape{

	double h,ba;
	public Triangle(double h, double ba) {
		this.h=h;
		this.ba=ba;
	}
	public double calculateArea() {
		return 0.5*(h*ba);
	}
	public String getShapeType() {
		return "Triangle";
		
	}
}
