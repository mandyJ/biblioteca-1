package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest{

    private String title;
    private String author;
    private int year;
    private PrintStream printStream;

    @Before
    public void setUp() throws Exception{

        title = "Harry Potter";
        author = "J.K. Rowling";
        year = 2000;
        printStream = mock(PrintStream.class);
    }

    @Test
    public void shouldPrintTitleAuthorAndYearWhenPrintBookDetailsIsCalled() {

        Book book = new Book(title, author, year, printStream);

        book.printBookDetails();

        verify(printStream).println(contains(title));
        verify(printStream).println(contains(author));
        verify(printStream).println(contains(year + ""));
    }


}