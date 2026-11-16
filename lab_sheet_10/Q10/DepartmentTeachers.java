package lab_sheet_10.Q10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class Department {
    private final String name;

    Department(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void display() {
        System.out.println("Department: " + getName());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Teacher extends Department {
    private final String teacherName;
    private final String subject;

    Teacher(String departmentName, String teacherName, String subject) {
        super(departmentName);
        this.teacherName = teacherName;
        this.subject = subject;
    }

    @Override
    void display() {
        System.out.println("Teacher: " + teacherName + ", Subject: " + subject);
    }
}

class School {
    private final ArrayList<Department> departments = new ArrayList<>();
    private final HashMap<Department, List<Teacher>> teachersByDepartment = new HashMap<>();

    void addTeacher(Department department, Teacher teacher) {
        if (!departments.contains(department)) {
            departments.add(department);
        }
        teachersByDepartment
                .computeIfAbsent(department, key -> new ArrayList<>())
                .add(teacher);
    }

    void displayTeachers() {
        for (Department department : departments) {
            department.display();
            List<Teacher> teachers = teachersByDepartment.get(department);
            for (Teacher teacher : teachers) {
                teacher.display();
            }
        }
    }
}

public class DepartmentTeachers {
    public static void main(String[] args) {
        School school = new School();

        Department science = new Department("Science");
        Department arts = new Department("Arts");
        school.addTeacher(science, new Teacher("Science", "Asha", "Physics"));
        school.addTeacher(science, new Teacher("Science", "Ravi", "Chemistry"));
        school.addTeacher(arts, new Teacher("Arts", "Maya", "History"));

        school.displayTeachers();
    }
}
