package lab_sheet_9.Q26;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    private final int id;
    private final String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}

public class StudentIterator {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101, "Asha"));
        students.add(new Student(102, "Ravi"));
        students.add(new Student(103, "Maya"));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
