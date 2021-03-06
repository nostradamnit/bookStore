package com.acme.bookstore.usecase;

import com.acme.bookstore.common.UseCase;

public class RegisterBookUseCase implements UseCase {

    public RegisterBookUseCase(String title, String author, String description, String isbn) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.isbn = isbn;
    }

    String isbn;
    String title;
    String author;
    String description;
}
