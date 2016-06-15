package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Book {
    private String title;
    private String author;
    private int year;
    private PrintStream printStream;

    public Book(String title, String author, int year, PrintStream printStream) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.printStream = printStream;
    }

    public void printBookDetails() {
        printStream.println(title + "\t" + author + "\t" + year);
    }
}
