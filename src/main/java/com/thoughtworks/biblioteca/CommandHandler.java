package com.thoughtworks.biblioteca;

import java.io.IOException;
import java.util.Map;

public class CommandHandler {
    private Map<String, String> commandMap;

    public CommandHandler(Map<String, String> commandMap){
        this.commandMap = commandMap;
    }

    public boolean isValidCommand(String command){
        if(commandMap.containsKey(command)) return true;
        else return false;
    }

//    public String readUserInput() {
//        String userInput = "0";
//
//        try {
//            userInput = bufferedReader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return userInput;
//
//    }


}
