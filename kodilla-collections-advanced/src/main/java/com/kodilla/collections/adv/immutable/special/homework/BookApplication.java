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

        System.out.println(selectedBook1.toString() + " addres: " + System.identityHashCode(selectedBook1) + " hashcode: " + selectedBook1.hashCode());
        System.out.println(selectedBook2.toString() + " addres: " + System.identityHashCode(selectedBook2) + " hashcode: " + selectedBook2.hashCode());
        System.out.println(selectedBook3.toString() + " addres: " + System.identityHashCode(selectedBook3) + " hashcode: " + selectedBook3.hashCode());

    }
}
