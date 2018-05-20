package org.itstep;

public class Runner {

	public static void main(String[] args) {
		Square square1 = new Square();

		square1.setSide(35);

		Square square2 = new Square();

		square2.setSide(60);

		
		System.out.println(square1.getArea());
		System.out.println(square2.getArea());
		
		Triangle triangle1 = new Triangle();
		
		triangle1.setBase(40);
		triangle1.setHeigth(32);
		
		Triangle triangle2 = new Triangle();
		
		triangle2.setBase(25);
		triangle2.setHeigth(15);
		
		System.out.println(triangle1.getArea());
		System.out.println(triangle2.getArea());
		
		Circle circle1 = new Circle();
		
		circle1.setRadius(15);
		
		Circle circle2 = new Circle();
		
		circle2.setRadius(31);
		
		System.out.println(circle1.getArea());
		System.out.println(circle2.getArea());
		
	}
	
}
