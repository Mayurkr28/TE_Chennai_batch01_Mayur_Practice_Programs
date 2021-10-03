package com.sunday.assignments;

public class AreaAndPerimter {

	double length;
	double width;

	void Area() {
		double area;
		area = this.length * this.width;
		System.out.println("Area of rectangle is : " + area);
	}

	void Perimeter() {
		double perimeter;
		perimeter = 2 * (this.length + this.width);
		System.out.println("Perimeter of rectangle is : " + perimeter);
	}

	public static void main(String[] args) {
		AreaAndPerimter rect = new AreaAndPerimter();
		rect.length = 15;
		rect.width = 22;
		System.out.println("Length of Rectangle = " + rect.length);
		System.out.println("Width of Rectangle = " + rect.width);
		rect.Area();
		rect.Perimeter();
	}
}
