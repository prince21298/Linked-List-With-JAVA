package com.linked_list;

import junit.framework.TestCase;

public class CustomLinkedListTest extends TestCase {

    public void testGetNodeFromValue() {
        CustomLinkedList node = new CustomLinkedList();
        node.insertFirst(23);
        node.insertLast(54);
        assertEquals(23, node.getData(node.getNodeFromValue(23)));
    }

    public void testInsertFirst() {
        CustomLinkedList node = new CustomLinkedList();
        node.insertFirst(23);
        assertEquals(1, node.size());
    }

    public void testDeleteFirst() {
        CustomLinkedList node = new CustomLinkedList();
        node.insertFirst(23);
        node.deleteFirst();
        assertEquals(0, node.size());
    }

    public void testDeleteLast() {
        CustomLinkedList node = new CustomLinkedList();
        node.insertFirst(23);
        node.deleteLast();
        assertEquals(0, node.size());
    }

    public void testDeleteFromIndex() {
        CustomLinkedList node = new CustomLinkedList();
        node.insertFirst(23);
        node.insertFirst(22);
        node.insertFirst(24);
        node.deleteFromIndex(1);
    }

    public void testGet() {
    }

    public void testInsertLast() {
    }

    public void testInsertOnIndex() {
    }

    public void testReverseDescLinkedList() {
    }

    public void testSortAscLinkedList() {
    }

    public void testSortDescLinkedList() {
    }

    public void testDisplay() {

    }

    public void testReverseDisplay() {
    }
}