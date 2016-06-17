package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Application {

    private MainMenu mainMenu;
    private PrintStream printStream;
    private Library library;

    public Application(Library library, MainMenu mainMenu, PrintStream printStream) {
        this.mainMenu = mainMenu;

        this.printStream = printStream;

        this.library = library;
    }




}
