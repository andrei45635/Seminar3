package org.example.seminar1.seminar3;

import org.example.seminar1.seminar3.domain.Student;
import org.example.seminar1.seminar3.map.MyMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        testSet();
        testMap();
        testMyMap();
    }

    private static void testMap() {
        Student s1 = new Student(1, "Dan", 4.5f);
        Student s2 = new Student(2, "Ana", 8.5f);
        Student s3 = new Student(3, "Dan", 4.5f);

        //Map<Integer, Student> studentMap = new HashMap<>();
        Map<Integer, Student> studentMap = new TreeMap<>();

        studentMap.put(s1.getId(), s1);
        studentMap.put(s2.getId(), s2);
        studentMap.put(s3.getId(), s3);

        for (Map.Entry<Integer, Student> stud : studentMap.entrySet()) {
            System.out.println(stud.getKey() + ": " + stud.getValue());
        }
    }

    private static void testSet() {
        Student s1 = new Student(1, "Dan", 4.5f);
        Student s2 = new Student(2, "Ana", 8.5f);
        Student s3 = new Student(3, "Dan", 4.5f);

        Set<Student> students = new TreeSet<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);

        for (Student stud : students) {
            System.out.println(stud);
        }
    }

    private static void testMyMap() {
        Student s1 = new Student(1, "Dan", 4.5f);
        Student s2 = new Student(2, "Ana", 8.55f);
        Student s3 = new Student(3, "Dan", 4.5f);
        Student s4 = new Student(4, "Dan1", 2.35f);
        Student s5 = new Student(5, "Dan2", 3.5f);
        Student s6 = new Student(6, "Dan3", 5.45f);
        Student s7 = new Student(7, "Dan4", 6.5f);
        Student s8 = new Student(8, "Dan5", 7.5f);
        Student s9 = new Student(9, "Dan6", 9.25f);
        Student s10 = new Student(10, "Dan7", 1.55f);

        MyMap map = new MyMap();

        map.add(s1);
        map.add(s2);
        map.add(s3);
        map.add(s4);
        map.add(s5);
        map.add(s6);
        map.add(s7);
        map.add(s8);
        map.add(s9);
        map.add(s10);

        for(Map.Entry<Integer, Set<Student>> entry: map.getEntries()){
            System.out.println(entry);
        }
    }
}
