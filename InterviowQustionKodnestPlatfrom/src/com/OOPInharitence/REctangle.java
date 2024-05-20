package com.OOPInharitence;

public class REctangle extends Shape{

	double l,b;
	public REctangle(double l, double b) {
		this.l=l;
		this.b=b;
	}
	public double calculateArea() {
		return l*b;
	}
	public String getShapeType() {
		return "Rectangle";
		
	}
}
