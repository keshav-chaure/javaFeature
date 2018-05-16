package com.yash.kc.java5;

public enum JuicerSpeedState {
	LOW("1"), MEDIUM("2"), HIGH("3"), VERYHIGH("4");

	private String value;

	JuicerSpeedState(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
