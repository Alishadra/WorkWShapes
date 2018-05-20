package org.itstep;

public class Triangle {

	private int base;
	private int height;

	public int getArea() {

		int area = base * height / 2;
		return area;

	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	public void setHeigth(int heigth) {
		this.height = heigth;
	}
}
