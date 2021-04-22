package com.tts.company;

public class Book {
    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        // Implement this method
        this.borrowed = false ;
        this.title = bookTitle ;
    }

    // Marks the book as rented
    public void rented() {
        // Implement this method
        this.borrowed = true ;
    }

    // Marks the book as not rented
    public void returned() {
        // Implement this method
        this.borrowed = false ;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
        return this.borrowed ;
    }

    public void printAvailableBooks(){

    }

    // Returns the title of the book
    public String getTitle() {
        return this.title ;
    }

   }
