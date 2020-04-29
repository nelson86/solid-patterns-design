package com.narabel.solid.c_LiskovSubstitution;

public class Main {

	public static void main(String[] args) {
		System.out.println(">> Liskov Substitution Principle");

		// Jaguar jaguar = new Jaguar();

		IFelino jaguar = new Jaguar();
		jaguar.cazar();
	}

}
