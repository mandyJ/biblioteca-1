package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class CommandHandlerTest {

    Map <String, Command> userOptions;
    CommandHandler commandHandler;
    private PrintStream printStream;
    private ListBooksCommand listBooksOption;
    private BufferedReader bufferedReader;
    private InputValidator inputValidator;

    @Before
    public void setUp(){
        listBooksOption = mock(ListBooksCommand.class);
        userOptions = new HashMap<String, Command>(){};
        userOptions.put("1", listBooksOption);
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        inputValidator = mock(InputValidator.class);
        commandHandler = new CommandHandler(userOptions, inputValidator);
    }


    @Test
    public void shouldInteractWithInputValidatorWhenExecuteCommand() {

        commandHandler.executeValidCommand();

        verify(inputValidator).getValidInputFromUser();
    }

    @Test
    public void shouldExecuteCommandWhenCommandIsInput() {
        when(inputValidator.getValidInputFromUser()).thenReturn("1");

        commandHandler.executeValidCommand();

        verify(listBooksOption).executeCommand();
    }
}