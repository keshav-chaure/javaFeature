package com.yash.kc.java8;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

	public void demo() {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("array LIst : " + al);
		al.add(6);
		al.add(4);
		System.out.println("insertion order maintained : " + al);
		Collections.sort(al);
		System.out.println("sorted list : " + al);
		System.out.println("duplicate allowed ");
		al.add(null);
		System.out.println("null added to  list : " + al);
		al.add(null);
		System.out.println("multiple null allowed to list : " + al);
		try {
			Collections.sort(al);

		} catch (NullPointerException e) {
			System.out.println("can't perform operation on list with null : " + al);
		}
		Collections.reverse(al);
		System.out.println("reverse list : " + al);
		al.remove(1);
		Object[] intArray= al.toArray();
		System.out.println("removed from list : " + al);
		System.out.println("contains 1 : " + al.contains(1));
		System.out.println("get indexof 1 : " + al.indexOf(1));
		System.out.println("defualt capacity is 10  ,  New capacity=(current capacity*3/2)+1.");
		

	}

}
