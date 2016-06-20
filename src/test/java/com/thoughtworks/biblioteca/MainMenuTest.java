package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Map;

import static org.mockito.Mockito.*;

public class MainMenuTest {

    private ArrayList<Book> books;
    private PrintStream printstream;
    private BufferedReader bufferedReader;
    private MainMenu mainMenu;
    CommandHandler commandHandler;
    Map<String,Command> menuOptions;

    @Before
    public void setUp() throws Exception {
        books = mock(ArrayList.class);
        printstream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        menuOptions = mock(Map.class);
        commandHandler = mock(CommandHandler.class);
        mainMenu = new MainMenu(menuOptions, commandHandler, printstream);
    }

    @Test
    public void shouldExecuteCommandHandlerAfterMenuIsDisplay() {

        mainMenu.startOptions();

        verify(commandHandler).executeValidCommand();
    }

}