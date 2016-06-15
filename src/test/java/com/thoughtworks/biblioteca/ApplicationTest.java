package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class ApplicationTest {
    PrintStream printStream;
    ArrayList<Book> books;
    Book book;
    Application application;
    BufferedReader bufferedReader;


    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        books = new ArrayList<Book>();
        book = mock(Book.class);
        books.add(book);
        application = new Application(books, printStream, bufferedReader);
    }

    @Test
    public void shouldWelcomeUserWhenStarting() {
        // Arrange OR Given
        // Action OR When
        application.start();
        // Assert OR Then
        verify(printStream).println(contains("Welcome"));
    }


    @Test
    public void shouldDisplayListBooksOptionAfterWelcome() {
        application.start();

        verify(printStream).println(contains("Enter an option:"));
        verify(printStream).println(contains("1: List Books"));
    }

    @Test
    public void shouldNotPrintBookListBeforeUserChoosesOption() throws Exception {
        when(bufferedReader.readLine()).thenReturn("");

        application.start();

        verify(book, never()).printBookDetails();
    }

    @Test
    public void shouldPrintBookDetailsWhenUserRequestsList() throws Exception{
        when(bufferedReader.readLine()).thenReturn("1");

        application.start();

        verify(book).printBookDetails();
    }
    


}