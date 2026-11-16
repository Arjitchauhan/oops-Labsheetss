package lab_sheet_10.Q03;

import java.util.HashSet;
import java.util.Objects;

class Book {
    private final int id;
    private final String title;
    private final String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class BookHashSet {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book(1, "The Hobbit", "J. R. R. Tolkien"));
        books.add(new Book(2, "Pride and Prejudice", "Jane Austen"));
        boolean duplicateAdded = books.add(new Book(1, "Different title", "Another author"));

        System.out.println("Duplicate with ID 1 added: " + duplicateAdded);
        System.out.println("Books:");
        for (Book book : books) {
            book.display();
        }
    }
}
