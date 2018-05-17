package com.yash.kc.java8;

public class Marble {
	
	private String color;
	
	public Marble(String color){
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Marble [color=" + color + "]";
	}
}
