package com.book.store.app.bookstoreapplication.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter@Builder
public class BookResponse {
    private int id;
    private String productTitle;
    private String description;
    private String price;
    private String thumnail;
}
