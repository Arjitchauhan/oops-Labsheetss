package lab_sheet_10.Q05;

import java.util.HashMap;
import java.util.Map;

class Student {
    private final int rollNumber;
    private final String name;

    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    void display() {
        System.out.println("Roll number: " + rollNumber + ", Name: " + name);
    }
}

class StudentRegistry {
    private final HashMap<Integer, String> students = new HashMap<>();

    void addStudent(int rollNumber, String name) {
        students.put(rollNumber, name);
    }

    void removeStudent(int rollNumber) {
        students.remove(rollNumber);
    }

    void displayStudents() {
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            new Student(entry.getKey(), entry.getValue()).display();
        }
    }
}

public class StudentHashMap {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        registry.addStudent(101, "Asha");
        registry.addStudent(102, "Ravi");
        registry.addStudent(103, "Maya");
        registry.removeStudent(102);

        System.out.println("Students:");
        registry.displayStudents();
    }
}
