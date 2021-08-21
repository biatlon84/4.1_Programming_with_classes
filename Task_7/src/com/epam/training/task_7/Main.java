package com.epam.training.task_7;

public class Main {
	// Write a class that represents a triangle.
	// Provide methods for creating objects, calculating
	// area, perimeter and point of intersection of the medians.

	public static void main(String[] args) {

		// Triangle t = new Triangle(10, 10);

		PointD aa = new PointD(0, 10);
		PointD bb = new PointD(-8.66026, -5);
		PointD cc = new PointD(8.66026, -5);
		Triangle t = new Triangle(aa, bb, cc);

		System.out.println("Area " + t.area());
		System.out.println("Perimeter " + t.perimeter());
		System.out.print("Intersection of medians " + t.center());
	}

}
