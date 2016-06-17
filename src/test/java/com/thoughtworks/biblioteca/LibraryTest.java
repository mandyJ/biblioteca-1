package com.thoughtworks.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {

    @Test
    public void shouldListDetailsWhenListBooks() {

        List<Book> books =  new ArrayList<Book>();
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        Collections.addAll(books, book1, book2);

        Library library = new Library(books);
        library.listBooks();

        verify(book1).printBookDetails();
        verify(book2).printBookDetails();


    }




}