package com.yash.kc.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public void exampleOne() {
        Map std = new HashMap();
        std.put(1, "keshav");
        std.put(2, "Ravi");

        System.out.println(std);

        System.out.println("geting entryset and traversing in for loop");
        Set<Map.Entry<Integer, String>> entrySet = std.entrySet();
        System.out.println(entrySet);

        for (Map.Entry entry : entrySet) {
            System.out.println("key : " + entry.getKey());
            System.out.println("value : " + entry.getValue());
            System.out.println("...");

        }
        System.out.println("key iterater");

        Iterator iterater = std.keySet().iterator();
        while (iterater.hasNext()) {
            System.out.println("key set using iterater" + iterater.next());
        }

        System.out.println("value  iterater");
        Iterator itrValue=std.values().iterator();
        while(itrValue.hasNext()){
            System.out.println("value set using iterater"+itrValue.next());
        }

        System.out.println("getting element");
        String name = (String) std.get(2);
        System.out.println("value at key 2" + name);

        System.out.println("removing elelment ");
        std.remove(1);
        System.out.println("after removing 1 key 1"+std);

    }

}
