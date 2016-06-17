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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MainMenuTest {

    private ArrayList<Book> books;
    private PrintStream printstream;
    private BufferedReader bufferedReader;
    private MainMenu mainMenu;

    @Before
    public void setUp() throws Exception {
        books = mock(ArrayList.class);
        printstream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        Map<String,String> menuOptions = new HashMap<String, String>();
        menuOptions.put("1", "List Books");
        menuOptions.put("2", "Some other option");
        mainMenu = new MainMenu( menuOptions, printstream );
    }

    @Test
    public void shouldListMenuOptionsWhenShowMenuOptions() {

        mainMenu.showMenuOptionsAndGrabInput();

        verify(printstream).println("Enter an option:");
        verify(printstream).println("1: List Books");
        verify(printstream).println("2: Some other option");
    }

    @Test
    public void shouldGiveCommandHandlerUserCommandWhenUserInputsCommand(){


    }
//
//    @Test
//    public void shouldReturnStringWhenUserInputs() throws IOException {
//        when(bufferedReader.readLine()).thenReturn("1");
//
//        assertEquals("1", mainMenu.readUserInput());
//
//    }
//
//    @Test
//    public void shouldReturn0WhenUserEntersInvalidOption() throws IOException {
//        when(bufferedReader.readLine()).thenReturn("bad string");
//
//        assertEquals("0", mainMenu.readUserInput());
//    }
}