package lab_sheet_10.Q04;

import java.util.TreeSet;

class Product implements Comparable<Product> {
    private final int id;
    private final String name;
    private final double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    void display() {
        System.out.println("ID: " + getId() + ", Product: " + getName()
                + ", Price: " + getPrice());
    }

    @Override
    public int compareTo(Product other) {
        int priceOrder = Double.compare(getPrice(), other.getPrice());
        return priceOrder != 0 ? priceOrder : Integer.compare(getId(), other.getId());
    }
}

public class ProductTreeSet {
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<>();
        products.add(new Product(1, "Notebook", 3.50));
        products.add(new Product(2, "Pen", 1.25));
        products.add(new Product(3, "Backpack", 25.00));
        products.add(new Product(4, "Ruler", 2.00));
        products.add(new Product(5, "Pencil", 0.75));

        System.out.println("Products sorted by price:");
        for (Product product : products) {
            product.display();
        }
    }
}
