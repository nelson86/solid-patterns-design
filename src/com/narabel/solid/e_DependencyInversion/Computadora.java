package com.narabel.solid.e_DependencyInversion;

public class Computadora {

	private ITeclado teclado;
	private IMouse mouse;
	
	public Computadora(ITeclado iteclado, IMouse imouse) {
		this.teclado = iteclado;
		this.mouse = imouse;
	}
	
	public void encender() {

		this.teclado.conectar();
		this.mouse.conectar();

	}
}
