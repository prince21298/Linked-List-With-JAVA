package com.linked_list;

public class CustomDoubleLinkedList {
    private Node head;
    private int size;
    private Node tail;
    private Node indexZeroHead;

    private static class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertFirst(int value) {
        if (head != null) {
            Node node = new Node(value);
            node.next = head;
            head = node;
            size++;
            indexZeroHead = head;
        } else {
            Node node = new Node(value);
            head = node;
            size++;
            tail = head;
            indexZeroHead = head;
        }
    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    
        Node node = head;
        for (int i = 1; i < index; i++) {
            Node previous = node;
            node = node.next;
            node.previous = previous;
        }
        return node;
    }

    
    public void addOnIndex(int index ,int value){
        head = indexZeroHead;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 1) { 
            insertFirst(value);
            return;
        } else { 
            Node newNode = new Node(value);
            Node getIndexNode = get(index-1);
            Node currentNode = getIndexNode.next;
            getIndexNode.next = newNode;
            newNode.next = currentNode;
            size++;
        }
    }

    // public void removeFromIndex(int index ){
    //     head = indexZeroHead;
    //     if (index < 0 || index > size) {
    //         throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    //     }
    //     else { 
    //         Node getIndexNode = get(index);
    //         Node NextNode = getIndexNode.next;
    //         NextNode.previous = getIndexNode.previous;
    //         head = NextNode;
    //         size--;
    //     }
    // }

    public void insertLast(int value) {
        if (size <= 0) {
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void Display() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.value + " -> ");
            currNode = currNode.next;
        }
        System.out.println("End Here.....");
    }

}
