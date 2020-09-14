package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    public Set<Book> books = new HashSet<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (books.contains(book)) {
            System.out.println("The selected book already exists: " + book.getTitle() + " " + book.getAuthor());
        } else {
            System.out.println("This book has been added to the set of 'books': " + book.getTitle() + " " + book.getAuthor());
            books.add(book);
        }
        return book;
    }

    public Set<Book> getBooks() {
        return books;
    }
}

