package lab_sheet_10.Q07;

import java.util.Vector;

class Customer {
    private int id;
    private String name;
    private String email;

    Customer(int id, String name, String email) {
        setId(id);
        setName(name);
        setEmail(email);
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void display() {
        System.out.println("ID: " + getId() + ", Name: " + getName()
                + ", Email: " + getEmail());
    }
}

public class CustomerVector {
    public static void main(String[] args) {
        Vector<Customer> customers = new Vector<>();
        customers.add(new Customer(1, "Asha", "asha@example.com"));
        customers.add(new Customer(2, "Ravi", "ravi@example.com"));

        for (Customer customer : customers) {
            customer.display();
        }
    }
}
