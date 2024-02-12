package com.linked_list.ArrayQueue;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> numbList = new ArrayList();
        numbList.add(23);
        numbList.add(24);
        numbList.add(25);
        numbList.add(34);
        numbList.add(45);
        numbList.add(56);
        numbList.add(67);
        numbList.add(78);
        System.out.println(numbList.toString());
        Iterator<Integer> ArrayValue = numbList.iterator();
        while (ArrayValue.hasNext()){
            System.out.println(ArrayValue.next());
        }
    }
}
