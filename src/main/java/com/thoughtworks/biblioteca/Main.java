package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry Potter", "J.K. Rowling", 1636, System.out));
        books.add(new Book("Stardust", "Neil Gaiman", 1665, System.out));
        new Application(books, System.out, new BufferedReader(new InputStreamReader(System.in))).start();
    }
}
