package com.example.bookmanager;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.addBook(new Book("1984", "George Orwell"));
        bookManager.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        bookManager.addBook(new Book("asam kalyan", "SLN"));
        bookManager.addBook(new Book("Pandu", "Krishna"));

        System.out.println("Books in the manager:");
        for (Book book : bookManager.getBooks()) {
            System.out.println(book);
        }

        // Remove a book
        bookManager.removeBook("1984");
        System.out.println("\nAfter removing '1984':");
        for (Book book : bookManager.getBooks()) {
            System.out.println(book);
        }

        // Search for a book
        Book foundBook = bookManager.searchBook("To Kill a Mockingbird");
        System.out.println("\nSearching for 'To Kill a Mockingbird': " + foundBook);
    }
}