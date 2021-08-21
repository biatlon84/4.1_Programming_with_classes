package com.epam.training.task_7;

import java.awt.geom.Point2D;
import java.util.Objects;

public class PointD extends Point2D {

	private double x;
	private double y;

	public PointD(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(x, y);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PointD other = (PointD) obj;
		return java.lang.Double.doubleToLongBits(x) == java.lang.Double.doubleToLongBits(other.x)
				&& java.lang.Double.doubleToLongBits(y) == java.lang.Double.doubleToLongBits(other.y);
	}

	@Override
	public double distance(Point2D pt) {
		return Math.sqrt((this.x - pt.getX()) * (this.x - pt.getX()) + (this.y - pt.getY()) * (this.y - pt.getY()));
	}

	@Override
	public double getX() {

		return x;
	}

	@Override
	public double getY() {
		return y;
	}

	@Override
	public void setLocation(double arg0, double arg1) {
		x = arg0;
		y = arg1;

	}

	@Override
	public String toString() {
		return "X=" + x + ", Y=" + y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

}
