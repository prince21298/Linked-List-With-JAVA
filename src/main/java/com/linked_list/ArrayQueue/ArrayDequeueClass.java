package com.linked_list.ArrayQueue;

import java.util.ArrayDeque;

public class ArrayDequeueClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(99);
        arrayDeque.offerFirst(65);
        arrayDeque.offer(23);
        arrayDeque.offer(32);
        arrayDeque.offer(13);
        arrayDeque.offerLast(76);
        arrayDeque.offer(19);
        System.out.println(arrayDeque.toString());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.toString());
        System.out.println(arrayDeque.peekLast());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque);
//        System.out.println(arrayDeque.poll());
//        System.out.println(arrayDeque.toString());
//        main2(null);
//        System.out.println(priorityQueueClass.toString());
//        System.out.println(priorityQueueClass.peek());
    }
}
