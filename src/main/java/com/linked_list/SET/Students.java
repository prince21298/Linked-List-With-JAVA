package com.linked_list.SET;

import java.util.Objects;

public class Students {
    int Role_no;
    String name;

    @Override
    public String toString() {
        return "{"+ "Role_no : " + Role_no + ", name:"+ name + " }";
    }

    public Students(int role_no, String name) {
        Role_no = role_no;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Role_no == students.Role_no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Role_no);
    }
}
