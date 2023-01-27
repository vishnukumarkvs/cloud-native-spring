package com.bookstore.catalogservice.web;

import com.bookstore.catalogservice.config.BookstoreProperties;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class HomeController {
    BookstoreProperties bookstoreProperties;

    @GetMapping("/")
    public String getGreeting(){
        return  bookstoreProperties.getGreeting();
    }
}
