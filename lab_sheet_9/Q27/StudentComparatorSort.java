package lab_sheet_9.Q27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Student {
    private final int id;
    private final String name;
    private final double grade;

    Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + "}";
    }
}

public class StudentComparatorSort {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Asha", 88.5));
        students.add(new Student(102, "Ravi", 76.0));
        students.add(new Student(103, "Maya", 94.0));

        Collections.sort(students, Comparator.comparingDouble(Student::getGrade));
        System.out.println("Students sorted by grade:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
