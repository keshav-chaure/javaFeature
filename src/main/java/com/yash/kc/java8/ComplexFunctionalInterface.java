package com.yash.kc.java8;

@FunctionalInterface
public interface ComplexFunctionalInterface extends SimpleFuncInterface {

	default public void doSomeWork() {
		System.out.println("Doing some work in interface impl...");
	}

	default public void doSomeOtherWork() {
		System.out.println("Doing some other work in interface impl...");
	}
	
	public void doWork();
}
