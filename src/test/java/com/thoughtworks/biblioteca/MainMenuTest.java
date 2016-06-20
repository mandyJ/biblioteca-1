package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MainMenuTest {

    private ArrayList<Book> books;
    private PrintStream printstream;
    private BufferedReader bufferedReader;
    private MainMenu mainMenu;
    CommandHandler commandHandler;
    Map<String,String> menuOptions;

    @Before
    public void setUp() throws Exception {
        books = mock(ArrayList.class);
        printstream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        menuOptions = mock(Map.class);
        commandHandler = mock(CommandHandler.class);
        mainMenu = new MainMenu(menuOptions, commandHandler, printstream, bufferedReader);
    }

    @Test
    public void shouldListMenuOptionsWhenShowMenuOptions() throws IOException {

        mainMenu.showMenuOptionsAndGrabInput();

        verify(printstream).println("Enter an option:");
        verify(printstream).println("1: List Books");
        verify(printstream).println("2: Some other option");
    }

    @Test
    public void shouldGiveCommandHandlerUserCommandWhenUserInputsCommand() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");

        mainMenu.showMenuOptionsAndGrabInput();

        verify(commandHandler).handleCommand("1");
    }

    @Test
    public void shouldRepromptUserWhenUserEntersInvalidOption() throws IOException {
        when(menuOptions.containsKey(anyString())).thenReturn(false, true);

        mainMenu.showMenuOptionsAndGrabInput();

        verify(printstream).println("Select a valid option!");
    }


}