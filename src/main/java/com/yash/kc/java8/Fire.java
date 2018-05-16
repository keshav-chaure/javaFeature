package com.yash.kc.java8;

public interface Fire {
	default void emitesLight() {
		System.out.println("Fire emiting light");
	}

	default void emitesLight(String a) {
		System.out.println("Fire emiting light");
	}

	default void emitesHeat() {
		System.out.println("Fire emiting light");
	}

	static void consume() {
		System.out.println("Fire consume oil");
	}

	static void consume(String a) {
		System.out.println("Fire consume oil overloaded");
	}

}
