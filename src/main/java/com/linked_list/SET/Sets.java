package com.linked_list.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> numbersSets;
        numbersSets = new HashSet<>();
        numbersSets.add(23);
        numbersSets.add(32);
        numbersSets.add(43);
        numbersSets.add(12);
        numbersSets.add(22);
        numbersSets.add(65);
        numbersSets.add(23);
        numbersSets.remove(12);
        System.out.println(numbersSets);
        System.out.println(numbersSets.isEmpty());
        System.out.println(numbersSets.contains(23));
        numbersSets.clear();
        System.out.println(numbersSets);
        linkedHasSet();
        treeHasSet();
    }

    public static void linkedHasSet() {
        System.out.println("\n Linked Has Set");
        Set<Integer> numbersSets;
        numbersSets = new LinkedHashSet<>();
        numbersSets.add(23);
        numbersSets.add(32);
        numbersSets.add(43);
        numbersSets.add(12);
        numbersSets.add(22);
        numbersSets.add(65);
        numbersSets.add(23);
        numbersSets.remove(12);
        System.out.println(numbersSets);
        System.out.println(numbersSets.isEmpty());
        System.out.println(numbersSets.contains(23));
        numbersSets.clear();
        System.out.println(numbersSets);
    }

    public static void treeHasSet() {
        System.out.println(" \n Tree Has Set");
        Set<Integer> numbersSets;
        numbersSets = new TreeSet<>();
        numbersSets.add(23);
        numbersSets.add(32);
        numbersSets.add(43);
        numbersSets.add(12);
        numbersSets.add(22);
        numbersSets.add(65);
        numbersSets.add(23);
        numbersSets.remove(12);
        System.out.println(numbersSets);
        System.out.println(numbersSets.isEmpty());
        System.out.println(numbersSets.contains(23));
        numbersSets.clear();
        System.out.println(numbersSets);
    }


}