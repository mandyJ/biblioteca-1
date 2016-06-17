package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;
import java.util.Set;

public class MainMenu {
    private Map<String, String> menuOptions;
    private CommandHandler commandHandler;
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    public MainMenu(Map<String, String> menuOptions, CommandHandler commandHandler, PrintStream printStream, BufferedReader bufferedReader) {
        this.menuOptions = menuOptions;
        this.commandHandler = commandHandler;
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public void showMenuOptionsAndGrabInput() throws IOException {
        printStream.println("Enter an option:");

        Set<String> optionList = menuOptions.keySet();

        for (String optionKey: optionList){
            printStream.println(optionKey + ": " + menuOptions.get(optionKey));
        }

        String userOption = bufferedReader.readLine();

        commandHandler.handleCommand(userOption);

    }

}
