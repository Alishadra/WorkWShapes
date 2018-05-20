package org.itstep;

public class Circle {

	private int radius;

	public double getArea() {

		double area = radius * radius * Math.PI;
		return area;
	}

	public int getRadius() {
		return radius;
	}

	

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
}
