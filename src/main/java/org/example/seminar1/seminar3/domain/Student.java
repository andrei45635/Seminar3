package org.example.seminar1.seminar3.domain;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private final int id;
    private final String name;
    private final Float mean;

    public Student(int id, String name, float mean) {
        this.id = id;
        this.name = name;
        this.mean = mean;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mean=" + mean +
                '}';
    }

    public String getName() {
        return name;
    }

    public float getMean() {
        return mean;
    }

    @Override
    public int compareTo(Student o) {
        //return name.compareTo(o.name);
        //return mean.compareTo(o.mean);
        if (mean == o.mean) { //???
            return 0;
        } else if (mean < o.mean) {
            return 1;
        }
        return -1;
    }
}
