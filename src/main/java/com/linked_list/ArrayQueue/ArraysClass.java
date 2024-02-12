package com.linked_list.ArrayQueue;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int data[] = {12,54,23,65,24,57};
//        Arrays.stream(data).sorted();
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        int index = Arrays.binarySearch(data,54);
        System.out.println(index);

        // fill Specific Number in Array
        Arrays.fill(data,98);
        System.out.println(Arrays.toString(data));

    }
}
