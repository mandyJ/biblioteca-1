package com.thoughtworks.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Application {

    private ArrayList<Book> books;
    private BufferedReader bufferedReader;
    private PrintStream printStream;

    public Application(ArrayList<Book> books, PrintStream printStream, BufferedReader bufferedReader) {

        this.printStream = printStream;
        this.books = books;
        this.bufferedReader = bufferedReader;
    }



    public void start() {
        printStream.println("Welcome");

        printStream.println("Enter an option:");
        printStream.println("1: List Books");


        try{
            String userChoice = bufferedReader.readLine();

            if(userChoice.equals("1")){
                for(Book book : books)
                    book.printBookDetails();
            }
        }catch(Exception e){
            printStream.println(e.getMessage());
        }

    }
}
