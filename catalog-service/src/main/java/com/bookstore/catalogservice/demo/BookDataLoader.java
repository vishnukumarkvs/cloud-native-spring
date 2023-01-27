package com.bookstore.catalogservice.demo;

import com.bookstore.catalogservice.domain.Book;
import com.bookstore.catalogservice.domain.BookRepository;
import com.bookstore.catalogservice.domain.BookService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@Component
@Profile("testdata")
public class BookDataLoader {
    BookRepository bookRepository; // Also can use bookservice, but as its testdata, best using bookrepository

    @EventListener(ApplicationReadyEvent.class)
    public void loadTestData(){
        var book1 = new Book("1234567890","Book1","AuthorBook1",10.0);
        var book2 = new Book("2234567890","Book2","AuthorBook2",10.0);
        bookRepository.save(book1);
        bookRepository.save(book2);
    }


}
