package com.yash.kc.java5;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public void showGeneric() {

		List nameList = new ArrayList();
		nameList.add("one");
		nameList.add("two");
		nameList.add("three");
		
		String name1 = (String) nameList.get(0);
		
		/*
		 * for(String name : nameList){ System.out.println(name); }
		 * 
		 */

		List<String> nameList1 = new ArrayList();
		nameList1.add("one");
		nameList1.add("two");
		nameList1.add("three");
		String name2 = nameList1.get(0);

		for (String n : nameList1) {
			System.out.println(n);
		}
		
		Mango m=new Mango();
		Juicer<Mango> mangoJuicer = new Juicer();	 
		Juice mangoJuice=mangoJuicer.squize(m);
		
		Apple a=new Apple();
		Juicer<Apple> appleJuicer = new Juicer();	 
		Juice appleJuice=appleJuicer.squize(a);
		
	}
	
	public void  enumTest(){
		System.out.println(JuicerSpeedState.HIGH.name());
		JuicerSpeedState state=JuicerSpeedState.valueOf("HIGH");
		
	}
	
	

}
