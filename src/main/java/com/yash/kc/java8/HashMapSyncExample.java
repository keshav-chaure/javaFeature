package com.yash.kc.java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSyncExample {

	public void threadDemo() throws InterruptedException {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(2, "Anil");
		hmap.put(44, "Ajit");
		hmap.put(1, "Brad");
		hmap.put(4, "Sachin");
		hmap.put(88, "XYZ");

		Map map = Collections.synchronizedMap(hmap);
		Set set = map.entrySet();
		synchronized (map) {
			Iterator i = set.iterator();
			// Display elements
			while (i.hasNext()) {
				Thread.sleep(1000);
				System.out.println("in sync block "+Thread.currentThread().getName());
				Map.Entry me = (Map.Entry) i.next();
				System.out.print(me.getKey() + ": ");
				System.out.println(me.getValue());
			}
		}
	}

}
