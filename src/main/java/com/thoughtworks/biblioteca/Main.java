package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Command> userOptions = new HashMap<>();
        List<Book> books = new ArrayList<>();
        PrintStream printStream = new PrintStream(System.out);
        books.add(new Book("Harry Potter", "J.K. Rowling", 2001, printStream));
        Library library = new Library(books);
        userOptions.put("1", new ListBooksCommand(library));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        InputValidator inputValidator = new InputValidator(userOptions, printStream, bufferedReader);
        CommandHandler commandHandler = new CommandHandler(userOptions, inputValidator);
        MainMenu mainMenu = new MainMenu(userOptions, commandHandler, printStream);
        mainMenu.startOptions();
    }
}
