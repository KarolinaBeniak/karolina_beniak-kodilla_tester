package com.kodilla.collections.adv.immutable.special.homework;


public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        Book selectedBook1 = bookManager.createBook("Moc w gębie", "Tomasz Kamel");
        Book selectedBook2 = bookManager.createBook("Włam się do mózgu", "Radek Kotarski");
        Book selectedBook3 = bookManager.createBook("Moc w gębie", "Tomasz Kamel");


        System.out.println(selectedBook1 == selectedBook2);
        System.out.println(selectedBook1 == selectedBook3);
        System.out.println(selectedBook2 == selectedBook3);

        System.out.println(selectedBook1.equals(selectedBook2));
        System.out.println(selectedBook1.equals(selectedBook3));
        System.out.println(selectedBook2.equals(selectedBook3));

    }
}
