package com.narabel.solid.e_DependencyInversion;

public class Main {

	public static void main(String[] args) {
		System.out.println(">> Dependency Inversion Principle");

		Teclado teclado = new Teclado();
		Mouse mouse = new Mouse();
		

		Computadora computadora = new Computadora(teclado, mouse);
		computadora.encender();

	}

}
