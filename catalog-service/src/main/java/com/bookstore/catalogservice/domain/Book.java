package com.bookstore.catalogservice.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

public record Book(

        @NotBlank(message = "The book ISBN must be defined.")
        @Pattern(
                regexp = "^([0-9]{10}|[0-9]{13})$",
                message = "The ISBN format must be valid"
        )
        String isbn,
        @NotBlank(
                message = "The book title mus be defined"
        )
        String title,
        @NotBlank(message = "The book author must be defined")
        String author,
        @NotNull(message = "Book price must be defined")
        @Positive(
                message = "The book price must be grater than zero"
        )
        Double price
) {
}
