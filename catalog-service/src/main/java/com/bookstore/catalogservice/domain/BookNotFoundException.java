package com.bookstore.catalogservice.domain;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(String isbn){
        super("The book with isbn "+ isbn+ " isn't available");
    }

}
