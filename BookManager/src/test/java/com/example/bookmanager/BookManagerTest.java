package com.example.bookmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookManagerTest {

    @Test
    public void testAddBook() {
        BookManager bookManager = new BookManager();
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        bookManager.addBook(book);

        assertEquals(1, bookManager.getBooks().size());
        assertEquals("The Great Gatsby", bookManager.getBooks().get(0).getTitle());
    }
}