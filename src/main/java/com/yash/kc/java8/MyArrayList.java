package com.yash.kc.java8;

import java.util.Objects;

public class MyArrayList<E> {
	private int size;

	private Object[] elementData;
	private static final Object[] EMPTY_ELEMENTDATA = {};
	private static final int INITIAL_CAPACITY = 10;

	MyArrayList() {
		this.elementData = new Object[INITIAL_CAPACITY];
	}

	public boolean add(E e) {
		boolean status = false;
		if (isGrowing()) {
			reconstruct();
		}
		elementData[size++] = e;
		return false;
	}

	private void reconstruct() {
		Object[] temp = new Object[size + (size / 2)];
		System.arraycopy(this.elementData, 0, temp, 0, this.elementData.length);
		this.elementData=temp;

	}

	private boolean isGrowing() {
		return !(size < INITIAL_CAPACITY);
	}

	public int size() {
		return this.size;
	}

	public void show() {
		System.out.println("size : " + size);
		System.out.println("element " + elementData);
		for (Object object : elementData) {
			System.out.println("object : " + object);

		}
	}
	
	public String toString(){
		System.out.print("[");
		for (Object object : elementData) {
			if(Objects.nonNull(object))
			System.out.print(object.hashCode()+" ");
		}
		System.out.print("]");
		return null;
	
	}

}
