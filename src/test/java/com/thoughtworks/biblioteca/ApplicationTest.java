package com.thoughtworks.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.*;

public class ApplicationTest {

    @Test
    public void shouldWelcomeUserWhenStarting() {
        // Arrange OR Given
        PrintStream printStream = mock(PrintStream.class);
        Application application = new Application(printStream);
        // Action OR When
        application.start();
        // Assert OR Then
        verify(printStream).println(contains("Welcome"));
    }
}