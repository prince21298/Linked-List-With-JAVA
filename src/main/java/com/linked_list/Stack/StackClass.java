package com.linked_list.Stack;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> Vechical = new Stack<>();
        Vechical.push("Cycle");
        Vechical.push("MotorCycle");
        Vechical.push("Car");
        Vechical.push("Truck");
        Vechical.push("Bus");
        Vechical.push("Train");
        System.out.println(Vechical.toString());
        System.out.println(Vechical.peek());
        System.out.println(Vechical.toString());
        System.out.println(Vechical.pop());
        System.out.println(Vechical.toString());
        System.out.println(Vechical.peek());
    }
}
