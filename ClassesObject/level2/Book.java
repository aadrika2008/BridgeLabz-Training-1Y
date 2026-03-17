package com.gla.ClassesObject.level2;

public class Book {public String ISBN;        // Public - accessible everywhere
    protected String title;    // Protected - accessible in subclass
    private String author;     // Private - accessible only inside Book class

    // Setter method for author
    public void setAuthor(String authorName) {
        author = authorName;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }
}

// Subclass
class EBook extends Book {

    void displayDetails() {
        System.out.println("ISBN: " + ISBN);     // Accessible (public)
        System.out.println("Title: " + title);   // Accessible (protected)
        System.out.println("Author: " + getAuthor()); // Access via getter
    }

    public static void main(String[] args) {
        EBook ebook = new EBook();

        ebook.ISBN = "978-1234567890";
        ebook.title = "Java Programming";
        ebook.setAuthor("James Gosling");

        ebook.displayDetails();
    }
}
