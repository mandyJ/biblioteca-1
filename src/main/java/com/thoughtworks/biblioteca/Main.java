package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Book> books = new ArrayList<Book>();
        Collections.addAll(books, new Book("Harry Potter", "J.K. Rowling", 1636, System.out), new Book("Stardust", "Neil Gaiman", 1665, System.out));
        MainMenu mainMenu = new MainMenu(books, System.out, new BufferedReader(new InputStreamReader(System.in)));
        Library library = new Library(books);
//        mainMenu.showMenuOptionsAndGrabInput();
    }
}
