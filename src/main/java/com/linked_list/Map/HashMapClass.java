package com.linked_list.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        Map<String, Integer> Number = new HashMap<>();
        Number.put("one", 1);
        Number.put("Two", 2);
        Number.put("Three", 3);
        Number.put("Four", 4);
        Number.put("Five", 5);
//        if(Number.containsKey("Five")){
//            Number.put("Five",55);
//        }
        Number.putIfAbsent("Fifteen", 15);
        System.out.println(Number);

        // with key value pair
        System.out.println("\n For Loop \n");
        for (Map.Entry<String, Integer> element : Number.entrySet()) {
            System.out.print(element + " ");
            System.out.print(element.getKey() + " ");
            System.out.println(element.getValue());
        }

        // iteration with only keys
        for (String key: Number.keySet()){
            System.out.println(key);
        }

        //iteration with only values
        for (Integer value: Number.values()){
            System.out.println(value);
        }
    }
}
