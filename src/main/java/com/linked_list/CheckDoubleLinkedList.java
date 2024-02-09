package com.linked_list;


public class CheckDoubleLinkedList {
    public static void main(String[] args) {
        CustomDoubleLinkedList list = new CustomDoubleLinkedList();
        list.insertFirst(23);
        list.Display();
        list.insertFirst(42);
        list.insertFirst(92);
        list.Display();
        list.insertLast(87);
        list.Display();
        list.addOnIndex(2, 81);
        list.Display();
        list.addOnIndex(2, 85);
        list.Display();
        list.addOnIndex(6, 60);
        list.Display();
        list.addOnIndex(7, 62);
        list.Display();
        // list.removeFromIndex(4);
        // list.Display();
    }
}
