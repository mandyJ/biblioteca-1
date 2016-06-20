package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;

public class InputValidator {
    private Map<String, Command> userOptions;
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    public InputValidator(Map<String, Command> userOptions, PrintStream printStream, BufferedReader bufferedReader) {
        this.userOptions = userOptions;
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public String getValidInputFromUser() {
        String userInput = readLine();

        while(!userOptions.containsKey(userInput)){
            printStream.println("Select a valid option!");
            userInput = readLine();
        }

        return userInput;
    }

    private String readLine() {
        String input = "";
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
