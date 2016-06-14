package com.thoughtworks.biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        new Application(new ArrayList<String>(), new ArrayList<Book>(), System.out).start();
    }
}
