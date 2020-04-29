package com.narabel.solid.b_OpenClosed;

public class Main {

	public static void main(String[] args) {
		System.out.println(">> Open Closed principle");

		Rectangle rectangle	= new Rectangle(10, 20);
		Triangle triangle	= new Triangle(10, 5);
		
		Presentation presentation = new Presentation();
		presentation.area(rectangle);
		presentation.area(triangle);
	}

}
