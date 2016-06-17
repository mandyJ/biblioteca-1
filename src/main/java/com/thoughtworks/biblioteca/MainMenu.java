package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.Map;
import java.util.Set;

public class MainMenu {
    private Map<String, String> menuOptions;
    private PrintStream printStream;

    public MainMenu(Map<String, String> menuOptions, PrintStream printStream) {
        this.menuOptions = menuOptions;
        this.printStream = printStream;
    }

    public void showMenuOptionsAndGrabInput() {
        printStream.println("Enter an option:");

        Set<String> optionList = menuOptions.keySet();

        for (String optionKey: optionList){
            printStream.println(optionKey + ": " + menuOptions.get(optionKey));
        }

    }

}
