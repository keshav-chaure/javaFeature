package com.yash.kc.javaFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.yash.kc.java8.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		com.yash.kc.java5.Example app = new com.yash.kc.java5.Example();
		// app.showGeneric();
		// app.enumTest();
		// app.showGeneric();

		// java 8 interface default method
		SyskaLight led = new SyskaLight();
		// led.color="blue"; color is defined in interface so default public
		// static final
		// led.color="blue";
		// System.out.println("led color : "+ led.color);
		// System.out.println("led color : "+ led.getColor()); // behiviour from
		// abstract method
		// System.out.println("led color : "+ LightEmiter.color); // constant
		// form interface

		// java 8 interface static method
		// LightEmiter.consumes();

		HashMapSyncExample ex = new HashMapSyncExample();
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("One Thread");
				try {
					ex.threadDemo();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

		// lambda expression to create the object
		new Thread(() -> {
			System.out.println("Two Thread");			
			try {
				ex.threadDemo();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}).start();
		// lambda expression to create the object
				new Thread(() -> {
					System.out.println("Two Thread");			
					try {
						ex.threadDemo();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}).start();

		// innner class
		new Worker().carryOutWork(new SimpleFuncInterface() {
			@Override
			public void doWork() {
				// TODO Auto-generated method stub
				System.out.println("working fine ...");

			}
		});

		// lambda
		new Worker().carryOutWork(() -> {
			System.out.println("Working fine using lambda ");
		});

		new LightEmiter().emiteLight(() -> System.out.println("emiting light ..."));

		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// changed
		/*
		 * ArrayList marbles=new ArrayList();
		 * 
		 * marbles.add( new Marble("red")); marbles.add( new Marble("blue"));
		 * marbles.add( new Marble("white"));
		 * 
		 * System.out.println(marbles);
		 * 
		 * //sorting employees array using Comparable interface implementation
		 * Collections.sort(marbles);
		 * 
		 * 
		 * ArrayListEx arrayListEx=new ArrayListEx(); arrayListEx.demo();
		 */
		HashMapDemo demo = new HashMapDemo();
		demo.exampleOne();

	}
}
