package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class ApplicationTest {
    PrintStream printStream;
    Application application;
    MainMenu mainMenu;
    Library library;

//    @Before
//    public void setUp() throws Exception {
//        printStream = mock(PrintStream.class);
//        mainMenu = mock(MainMenu.class);
//        library = mock(Library.class);
//        application = new Application(library, mainMenu, printStream);
//
//    }
//
//    @Test
//    public void shouldWelcomeUserWhenStarting() {
//        // Arrange OR Given
//        // Action OR When
//        application.runApplication();
//        // Assert OR Then
//        verify(printStream).println(contains("Welcome"));
//    }
//
//    @Test
//    public void shouldShowMenuOptionsWhenStart() {
//        application.runApplication();
//
//        verify(mainMenu).showMenuOptions();
//    }
//
//    @Test
//    public void shouldRetrieveUserOptionWhenStart() throws IOException {
//        application.runApplication();
//
//        verify(mainMenu).readUserInput();
//    }
//
//    @Test
//    public void shouldDisplayListofBooksWhenUserEntersOne() {
//        when(mainMenu.readUserInput()).thenReturn("1");
//
//        application.runApplication();
//
//        verify(library).listBooks();
//
//    }
//
//    @Test
//    public void shouldRepromptUserWhenInvalidOptionSelected() {
//        when(mainMenu.readUserInput()).thenReturn("0");
//
//        application.runApplication();
//
//        verify(mainMenu).informUserOptionInvalid();
//    }

}