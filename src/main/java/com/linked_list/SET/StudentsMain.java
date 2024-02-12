package com.linked_list.SET;

import java.util.HashSet;
import java.util.Set;

public class StudentsMain {
    public static void main(String[] args) {
        Set<Students> Allstudent = new HashSet<>();
        Allstudent.add(new Students(12, "Prince"));
        Allstudent.add(new Students(23, "Ankit"));
        Allstudent.add(new Students(19, "Rohit"));
        Allstudent.add(new Students(54, "Mohit"));
        Allstudent.add(new Students(21, "Prince"));
        System.out.println(Allstudent);


    }
}
