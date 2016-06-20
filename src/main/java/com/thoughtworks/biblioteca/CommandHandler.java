package com.thoughtworks.biblioteca;

import java.util.Map;

public class CommandHandler {
    private Map<String, Command> commandMap;
    private InputValidator inputValidator;

    public CommandHandler(Map<String, Command> commandMap, InputValidator inputValidator){
        this.commandMap = commandMap;
        this.inputValidator = inputValidator;
    }


    public void executeValidCommand() {
        String userOption = inputValidator.getValidInputFromUser();
        commandMap.get(userOption).executeCommand();
    }

}