package com.linked_list.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueueClass = new PriorityQueue<>();
        priorityQueueClass.offer(99);
        priorityQueueClass.offer(65);
        priorityQueueClass.offer(23);
        priorityQueueClass.offer(32);
        priorityQueueClass.offer(13);
        priorityQueueClass.offer(76);
        System.out.println(priorityQueueClass.toString());
        System.out.println(priorityQueueClass.poll());
        System.out.println(priorityQueueClass.toString());
        main2(null);
//        System.out.println(priorityQueueClass.toString());
//        System.out.println(priorityQueueClass.peek());

    }

    public static void main2(String[] args) {
        PriorityQueue<Integer> priorityQueueClass = new PriorityQueue<>(Comparator.<Integer>reverseOrder());
        priorityQueueClass.offer(99);
        priorityQueueClass.offer(65);
        priorityQueueClass.offer(23);
        priorityQueueClass.offer(32);
        priorityQueueClass.offer(13);
        priorityQueueClass.offer(76);
        System.out.println(priorityQueueClass.toString());
        System.out.println(priorityQueueClass.poll());
        System.out.println(priorityQueueClass.toString());
    }
}
