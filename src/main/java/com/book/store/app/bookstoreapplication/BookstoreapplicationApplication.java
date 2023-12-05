package com.book.store.app.bookstoreapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class BookstoreapplicationApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookstoreapplicationApplication.class, args);
	}
}
