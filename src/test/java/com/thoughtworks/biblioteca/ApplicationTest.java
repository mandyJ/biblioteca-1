package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ApplicationTest {
    PrintStream printStream;
    ArrayList<String> bookTitles;
    ArrayList<Book> books;
    String title;


    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bookTitles = new ArrayList<String>();
        title = "Stardust";
        bookTitles.add(title);
    }

    @Test
    public void shouldWelcomeUserWhenStarting() {
        // Arrange OR Given
        Application application = new Application(new ArrayList<String>(), books, printStream);
        // Action OR When
        application.start();
        // Assert OR Then
        verify(printStream).println(contains("Welcome"));
    }

    @Test
    public void shouldDisplayListOfBooksAfterWelcoming(){
        Application application = new Application(bookTitles, books, printStream);

        application.start();

        verify(printStream).println(contains(title));

    }

    @Test
    public void shouldDisplayFormattedListOfBooksWithAuthorAndYear() {
        String author = "Neil Gaiman";
        int year = 1993;
        Book book = new Book(title, author, year);
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book);
        Application application = new Application(bookTitles, books, printStream);

        application.start();


        verify(printStream).println(contains(title));
        verify(printStream).println(contains(author));
        verify(printStream).println(contains(year + ""));
    }
}