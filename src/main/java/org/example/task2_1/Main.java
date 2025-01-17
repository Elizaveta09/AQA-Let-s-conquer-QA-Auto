package org.example.task2_1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Fairy Tales", "Tolstoi", 650.5);
        book.setAuthor("Author");
        book.setPrice(300.8);
        System.out.println(book);
    }
}