package com.narabel.solid.a_SingleResponsibility;

public class Main {


	public static void main(String[] args) {
		System.out.println(">> Single responsibility principle");

		Rectangle rectangle = new Rectangle(10, 20);

		/**
		 * Rectangle contenia la funcion de imprimir, pero 
		 * esta funcion no hacia a la cohesion de la clase
		 * por lo cual se lo desacoplo y paso a ser 
		 * parte de una clase nueva que lleve a cabo esa
		 * responsabilidad. De esta forma tenemos 2 clases
		 * altamente cohesivas
		 */
		Presentation presentation = new Presentation();

		presentation.print(rectangle);
	}


}
