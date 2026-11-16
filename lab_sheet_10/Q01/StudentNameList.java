package lab_sheet_10.Q01;

import java.util.ArrayList;

class Student {
    private final String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student: " + name);
    }
}

public class StudentNameList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Asha"));
        students.add(new Student("Ravi"));
        students.add(new Student("Maya"));

        students.remove(1);

        for (Student student : students) {
            student.display();
        }
    }
}
