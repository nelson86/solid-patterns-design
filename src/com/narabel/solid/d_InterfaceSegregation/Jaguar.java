package com.narabel.solid.d_InterfaceSegregation;

public class Jaguar implements IFelinoSalvaje {

	private int edad;
	private float peso;

	public Jaguar(int edad, float peso) {
		super();
		this.edad = edad;
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void cazar() {
		System.out.println("El Jaguar caza!!");
	}

	public void rugir() {
		System.out.println("El Jaguar ruge!!");
	}

}
