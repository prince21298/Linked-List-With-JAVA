package com.linked_list.ArrayQueue;

import com.linked_list.SET.Students;

import java.util.*;

public class StudentsMain {
    public static void main(String[] args) {
        List<Students> Allstudent = new ArrayList<>();
        Allstudent.add(new Students(12, "Prince"));
        Allstudent.add(new Students(23, "Ankit"));
        Allstudent.add(new Students(19, "Rohit"));
        Allstudent.add(new Students(54, "Mohit"));
        Allstudent.add(new Students(21, "Prince"));
        Students user1 = new Students(45,"Test1");
        Students user2 = new Students(32,"Test2");
        System.out.println(user2.compareTo(user1));
        System.out.println(Allstudent);
        Collections.sort(Allstudent);
        System.out.println(Allstudent);
        Collections.sort(Allstudent, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.name.compareTo(o2.name);
            }
        });
//        Collections.sort(Allstudent, new Comparator<Students>() {
//            @Override
//            public int compare(Students o1, Students o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });
        System.out.println(Allstudent);

    }
}
