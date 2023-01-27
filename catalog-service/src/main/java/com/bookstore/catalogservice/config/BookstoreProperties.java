package com.bookstore.catalogservice.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "bookstore")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookstoreProperties {
    String greeting;
}
