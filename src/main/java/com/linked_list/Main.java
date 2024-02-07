package com.linked_list;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer>  list = new LinkedList<>();
//        list.add(32);

        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(3);
        list.insertFirst(24);
        list.insertFirst(5);
        list.insertFirst(23);
        list.insertFirst(6);
        list.insertLast(34);
        list.insertLast(34);
        list.insertOnIndex(42,5);
        CustomLinkedList list1 = new CustomLinkedList();
        list1.insertLast(67);
//        list1.Display();
//        list.Display();
//        list.deleteFirst();
//        list.deleteLast();
//        list.deleteFromIndex(2);
        list.Display();
        list.reverseDescLinkedList();
        list.Display();
        list.reverseDescLinkedList();
        list.Display();
        list.sortAscLinkedList();
        list.Display();
        list.sortDescLinkedList();
        list.Display();
;        System.out.println(list.get(4));
    }
}
