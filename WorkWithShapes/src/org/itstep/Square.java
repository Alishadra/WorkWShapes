package org.itstep;

public class Square {

	private int side;
	
	public int getArea() 
	{
		int area = side*side;
		return area;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	
}
