package Mentor.Lesson7OOP.Product;

import java.io.FilenameFilter;

public class Book extends Product {
    private String author;
    public Book(String name, double price) {
        super(name, price);
        this.author = author;
    }

    @Override
    void displeyInfo() {
        System.out.println("📚 Book: " + name + ", Author: " + author + ", Price: " + price + " AZN");
    }
}
