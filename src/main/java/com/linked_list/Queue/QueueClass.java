package com.linked_list.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(23);
        queue.offer(32);
        queue.offer(43);
        queue.offer(54);
        queue.offer(65);
        queue.offer(76);
        System.out.println(queue.toString());
        System.out.println(queue.poll());
        System.out.println(queue.toString());
        System.out.println(queue.toString());
        System.out.println(queue.peek());
    }
}
