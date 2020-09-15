package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    public Set<Book> books = new HashSet<>();

    public Book createBook(String title, String author) {

        for(Book b : books) {
            if (b.getAuthor().equals(author) && b.getTitle().equals(title)) {
                System.out.println("The selected book already exists: " + b.getTitle() + " " + b.getAuthor());
                return b;
            }
        }

        Book book = new Book(title, author);
        books.add(book);
        System.out.println("This book has been added to the set of 'books': " + book.getTitle() + " " + book.getAuthor());
        return book;

    }

    public Set<Book> getBooks() {
        return books;
    }
}

