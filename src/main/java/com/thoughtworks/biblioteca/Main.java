package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, String> userOptions = new HashMap<String, String>();
        userOptions.put("1", "List Books");
        MainMenu mainMenu;
        PrintStream printStream = new PrintStream(System.out);

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry Potter", "J.K. Rowling", 2001, printStream));
        Library library = new Library(books);

        CommandHandler commandHandler = new CommandHandler(userOptions, library, printStream);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        mainMenu = new MainMenu(userOptions, commandHandler, printStream, bufferedReader);
        mainMenu.showMenuOptionsAndGrabInput();
    }
}
