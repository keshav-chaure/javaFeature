package com.yash.kc.java8;

public class Singleton {
	// static variable single_instance of type Singleton
	private static Singleton single_instance = null;
	private static int count=1;
	

	// variable of type String
	public String s;

	// private constructor restricted to this class itself
	private Singleton() {
		s = "Hello I am a string part of Singleton class";
	}

	// static method to create instance of Singleton class
	public static Singleton getInstance() {
		System.out.println(count);
		if (count > 3)
			return null;			
			
		if (single_instance == null){
			single_instance = new Singleton();
		}
		count++;
		return single_instance;	
		 
		
	}
}
