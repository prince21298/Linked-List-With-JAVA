package com.linked_list;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public int size() {
        return size;
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        @SuppressWarnings("unused")
        public Node(Node next) {
            this.next = next;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "{ " +
                    "value : " + value +
                    ", next : " + next +
                    " }";
        }

    }
    public int getData(Node node) {
        return node.value;
    }
    public Node getNodeFromValue(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public CustomLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;

    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;

    }

    public int deleteFromIndex(int index) {
        if (size <= 1) {
            return deleteFirst();
        } else if (index == size - 1) {
            return deleteLast();
        }
        Node previousNode = get(index - 1);
        int value = previousNode.next.value;
        previousNode.next = previousNode.next.next;
        return value;

    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insertOnIndex(int val, int index) {
        if (index == 0) {
            insertLast(val);
            return;
        } else if (size == 0) {
            insertLast(val);
            return;
        }
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        node.next = new Node(val, node.next);
        size++;
    }

    public void reverseDescLinkedList() {
        Node prev = null;
        Node current = head;
        Node nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    public void sortAscLinkedList() {
        if (head == null || head.next == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            @SuppressWarnings("unused")
            Node prev = null;
            Node current = head;
            Node nextNode = current.next;

            while (nextNode != null) {
                if (current.value > nextNode.value) {
                    int temp = current.value;
                    current.value = nextNode.value;
                    nextNode.value = temp;
                    swapped = true;
                }
                prev = current;
                current = nextNode;
                nextNode = nextNode.next;
            }
        } while (swapped);
    }

    public void sortDescLinkedList() {
        if (head == null || head.next == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            @SuppressWarnings("unused")
            Node prev = null;
            Node current = head;
            Node nextNode = current.next;

            while (nextNode != null) {
                if (current.value < nextNode.value) {
                    int temp = current.value;
                    current.value = nextNode.value;
                    nextNode.value = temp;
                    swapped = true;
                }
                prev = current;
                current = nextNode;
                nextNode = nextNode.next;
            }
        } while (swapped);
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End Here.....");
    }

    public void ReverseDisplay() {
        Node prev = null;
        Node current = head;
        Node nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }
}
