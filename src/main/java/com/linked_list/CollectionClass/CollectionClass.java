package com.linked_list.CollectionClass;

import java.util.*;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> numbList = new ArrayList<>();
        numbList.add(34);
        numbList.add(56);
        numbList.add(23);
        numbList.add(67);
        numbList.add(24);
        numbList.add(78);
        numbList.add(45);
        numbList.add(25);
        System.out.println(numbList);
        System.out.println("min " + Collections.min(numbList));
        System.out.println("min " + Collections.max(numbList));
        Collections.sort(numbList);
        System.out.println(numbList);
        // reverse Array;
        Collections.sort(numbList, Comparator.reverseOrder());
        System.out.println(numbList);
    }
}
