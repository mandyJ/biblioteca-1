package com.thoughtworks.biblioteca;

public class ListBooksCommand implements Command {

    private Library library;

    public ListBooksCommand(Library library) {

        this.library = library;
    }

    @Override
    public String showCommandName() {
        return "List Books";
    }

    @Override
    public void executeCommand() {
        library.listBooks();
    }
}
