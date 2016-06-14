package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Application {

    private ArrayList<Book> books;
    private PrintStream printStream;
    private ArrayList<String> bookTitles;

    public Application(ArrayList<String> bookTitles, ArrayList<Book> books, PrintStream printStream) {

        this.printStream = printStream;
        this.bookTitles = bookTitles;
        this.books = books;

        // TODO finish adding books arraylist

    }



    public void start() {
        printStream.println("Welcome");
        for(String book : bookTitles)
            printStream.println(book);
    }
}
