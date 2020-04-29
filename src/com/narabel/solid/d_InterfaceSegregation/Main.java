package com.narabel.solid.d_InterfaceSegregation;



public class Main {

	public static void main(String[] args) {
		System.out.println(">> Interface Segregation Principle");

		IFelino jaguar = new Jaguar(10, 120f);
		jaguar.cazar();

	}

}
