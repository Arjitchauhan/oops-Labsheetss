package lab_sheet_10.Q02;

import java.util.LinkedList;

class Person {
    private final String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Employee extends Person {
    private final int employeeId;
    private final String jobTitle;

    Employee(int employeeId, String name, String jobTitle) {
        super(name);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    void display() {
        System.out.println("ID: " + employeeId + ", Name: " + getName()
                + ", Job title: " + jobTitle);
    }
}

class EmployeeDirectory {
    private final LinkedList<Employee> employees = new LinkedList<>();

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    void displayEmployees() {
        for (Employee employee : employees) {
            employee.display();
        }
    }

    Employee searchByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }
}

public class EmployeeLinkedList {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addEmployee(new Employee(101, "Asha", "Developer"));
        directory.addEmployee(new Employee(102, "Ravi", "Designer"));

        System.out.println("Employees:");
        directory.displayEmployees();

        Employee result = directory.searchByName("Ravi");
        System.out.println("Search result:");
        if (result != null) {
            result.display();
        } else {
            System.out.println("Employee not found.");
        }
    }
}
