package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class InputValidatorTest {


    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Map userOptions;
    private InputValidator inputValidator;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        userOptions = mock(Map.class);
        inputValidator = new InputValidator(userOptions, printStream, bufferedReader);
    }

    @Test
    public void shouldRepromptUserWhenUserEntersAnInvalidOption() throws IOException {
        when(userOptions.containsKey(anyString())).thenReturn(false, true);

        inputValidator.getValidInputFromUser();

        verify(printStream).println("Select a valid option!");
    }

    @Test
    public void shouldReturnNumberOptionWhenUserEntersValidInput() throws IOException {

        when(userOptions.containsKey(anyString())).thenReturn(true);
        when(bufferedReader.readLine()).thenReturn("1");

        String userInput = inputValidator.getValidInputFromUser();

        assertEquals("1", userInput);
    }

}