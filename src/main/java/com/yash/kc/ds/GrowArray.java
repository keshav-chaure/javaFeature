package com.yash.kc.ds;

import java.util.Arrays;

public class GrowArray {
	private static final int DEFAULT_LENGTH = 3;
	int[] container;
	int size = 0;

	public GrowArray() {
		this.container = new int[DEFAULT_LENGTH];
	}

	public boolean add(int value) {
		System.out.println("adding vlaue "+value);

		if (needToGrow()) {
			grow();
		}
		
		this.container[size] = value;
		this.size++;
		System.out.println("GrowArray :  "+ Arrays.toString(this.container));
	//	System.out.println("GrowArray toString :  "+  this.container);
		return false;
	}

	private boolean needToGrow() {
		if (this.getSize() >= DEFAULT_LENGTH)
			return true;
		return false;
	}

	private void grow() {
		System.out.println("need to grow!!!");
		int oldCapacity=container.length;
		int newCapacity=oldCapacity * 2;

	}

	private int getSize() {
		return this.size;
	}

	@Override
	public String toString() {
		if(this.container[size-1] < 0)
			return "[]";
		
		 StringBuilder sb = new StringBuilder();
		 sb.append('[');
		 for(int i: this.container){
			 
			 sb.append(i).append(", "); 
		
			
		 }
		 sb.append(']').toString();
          return sb.toString();
	}
	
	

}
