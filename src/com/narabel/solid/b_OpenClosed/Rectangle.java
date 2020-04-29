package com.narabel.solid.b_OpenClosed;

public class Rectangle implements IFigura{
	private float base;
	private float height;

	public Rectangle(float base, float height) {
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

	public String toString() {
		return "Rectangle [base=" + base + ", height=" + height + "]";
	}

	public float getArea() {
		return this.getBase() * this.getHeight();
	}

	@Override
	public float area() {
		return this.getBase() * this.getHeight();
	}
}
