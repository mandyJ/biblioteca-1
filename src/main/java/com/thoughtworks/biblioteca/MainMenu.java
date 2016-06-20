package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.Map;

public class MainMenu {
    private Map<String, Command> menuOptions;
    private CommandHandler commandHandler;
    private PrintStream printStream;

    public MainMenu(Map<String, Command> menuOptions, CommandHandler commandHandler, PrintStream printStream) {
        this.menuOptions = menuOptions;
        this.commandHandler = commandHandler;
        this.printStream = printStream;
    }

    public void startOptions() {

        printStream.println("Enter an option:");

        for (String optionKey: menuOptions.keySet()){
            printStream.println(optionKey + ": " + menuOptions.get(optionKey).showCommandName());
        }

        //while(quitCommand.shouldNotQuit()){
            commandHandler.executeValidCommand();
        //}

    }

    private boolean shouldNotQuit(){
        return true;
    }

}
