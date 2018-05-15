package com.yash.kc.java5;

public class Juicer<T> {
	
	public  Juice<T> squize(T t){
		System.out.println("juice of "+t.getClass());
		
		return new Juice<T>();
	}
}
