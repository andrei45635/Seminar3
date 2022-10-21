package org.example.seminar1.seminar3.map;

import org.example.seminar1.seminar3.domain.Student;

import java.util.*;

public class MyMap{
    private final Map<Integer, Set<Student>> map; //Favor Composition instead of Inheritance

    public MyMap() {
        this.map = new TreeMap<>();
    }

    public void add(Student stud) {
        int avg = Math.round(stud.getMean());
        if (!map.containsKey(avg)) {
            Set<Student> students = new TreeSet<>();
            map.put(avg, students);
        }
        map.get(avg).add(stud);
    }

    public Set<Map.Entry<Integer, Set<Student>>> getEntries() {
        return map.entrySet();
    }
}
