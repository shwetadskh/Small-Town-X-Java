package com.tts.company;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // Add the missing implementation to this class
    String address;
    List<Book> bookList = new ArrayList<Book>();

    //empty constructor
    public Library() {
    }

    //1 parameter constructor
    public Library(String address) {
        this.address = address;

    }

    //method declaration
    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm");
    }

    public void printAddress() {
        System.out.println(this.address);
    }

    public void borrowBook(String title) {
        //set bookfound false
        Boolean bFound = false ;
        //pass entire object of BOOK to bookList array
        for (Book book : bookList) {
            //checking if book is available in the library if yes then "bfound" "true"
            if(book.getTitle().equalsIgnoreCase(title)) {
                bFound = true ;
                //checking if the book is rented
                if (book.isBorrowed()){
                    System.out.println("Sorry book is currently checked out by other member, please try again later");

                } else {
                    System.out.println("Book is available and issued to you");
                    book.borrowed = true ;
                }
            }
        }
        if (!bFound){
            System.out.println("Sorry book is not registered or not available in this library");
        }

    }

    public void returnBook(String title) {
        Boolean bFound = false ;

        for (Book book : bookList) {
            if(book.getTitle().equalsIgnoreCase(title)) {
                bFound = true ;
                if (book.isBorrowed()){
                    System.out.println("Thank you, book is checked in successfully");
                    book.borrowed = false ;

                } else {
                    System.out.println("Sorry, this is not our library book as our copy is in the library already");

                }
            }
        }
        if(!bFound) {
            System.out.println("This book is not ours, please check if you got it from some other library") ;
        }

    }

    void printAvailableBooks() {
        System.out.println("+++Following Books are available+++ ");
        int i = 1 ;
        for (Book book : bookList) {
            if(!book.isBorrowed()) {
                System.out.println(i + ". " + book.getTitle());
                i = i + 1;
            }
        }
        // if i == 1 , it means there is no books in the library catalogue
        if (i ==1 ){
            System.out.println("!!! Sorry, Currently no books are available, please check back again later");
        }
    }


}