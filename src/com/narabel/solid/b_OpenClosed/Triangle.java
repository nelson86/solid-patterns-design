package com.narabel.solid.b_OpenClosed;

public class Triangle implements IFigura {
	private float base;
	private float height;

	public Triangle(float base, float height) {
		this.base = base;
		this.height = height;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getArea() {
		return (this.getBase() * this.getHeight())/2;
	}

	@Override
	public float area() {
		return (this.getBase() * this.getHeight())/2;
	}
}
