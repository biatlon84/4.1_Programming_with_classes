package com.epam.training.task_7;

public class Triangle {

	private PointD a;
	private PointD b;
	private PointD c;;

	public Triangle(double x3, double y2) {
		super();
		PointD a = new PointD(0, 0);
		PointD b = new PointD(0, y2);
		PointD c = new PointD(x3, 0);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
		super();
		PointD a = new PointD(x1, y1);
		PointD b = new PointD(x2, y2);
		PointD c = new PointD(x3, y3);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle(PointD a, PointD b, PointD c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double area() {
		double p = perimeter() / 2;
		double s = p * (p - a.distance(b)) * (p - b.distance(c)) * (p - c.distance(a));
		return Math.sqrt(s);

	}

	public double side(PointD i, PointD q) {
		return i.distance(q);
	}

	public double perimeter() {
		return a.distance(b) + b.distance(c) + c.distance(a);
	}

	public PointD center() {
		PointD o = new PointD(a.getX() + b.getX() + c.getX(), a.getY() + b.getY() + c.getY());
		o.setX(o.getX() / 3);
		o.setY(o.getY() / 3);
		return o;
	}
}
