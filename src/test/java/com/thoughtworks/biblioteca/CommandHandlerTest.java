package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CommandHandlerTest {

    private Library library;
    Map userOptions;
    CommandHandler commandHandler;
    private PrintStream printStream;

    @Before
    public void setUp(){
        userOptions = mock(Map.class);
        library = mock(Library.class);
        printStream = mock(PrintStream.class);

        commandHandler = new CommandHandler(userOptions, library, printStream);
    }

    @Test
    public void shouldListBooksWhenHandlerReceives1() {
        commandHandler.handleCommand("1");

        verify(library).listBooks();
    }

    @Test
    public void shouldInformInvalidOptionWhenInvalidInput() {
        commandHandler.handleCommand("bad command");

        verify(printStream).println("Please enter a valid option.");
    }
}