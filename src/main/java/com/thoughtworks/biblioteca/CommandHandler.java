package com.thoughtworks.biblioteca;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;

public class CommandHandler {
    private Map<String, String> commandMap;
    private Library library;
    private PrintStream printStream;

    public CommandHandler(Map<String, String> commandMap, Library library, PrintStream printStream){
        this.commandMap = commandMap;
        this.library = library;
        this.printStream = printStream;
    }

    public void handleCommand(String userOptionChoice) {
        if(userOptionChoice.equals("1")){
            library.listBooks();
        }else{
            printStream.println("Please enter a valid option.");
        }
    }


}
