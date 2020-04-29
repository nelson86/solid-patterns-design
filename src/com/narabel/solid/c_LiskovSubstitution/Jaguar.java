package com.narabel.solid.c_LiskovSubstitution;

public class Jaguar implements IFelino {

	@Override
	public void cazar() {
		System.out.println("El Jaguar caza!!");
	}

	@Override
	public void rugir() {
		System.out.println("El Jaguar ruge!!");
	}

}
