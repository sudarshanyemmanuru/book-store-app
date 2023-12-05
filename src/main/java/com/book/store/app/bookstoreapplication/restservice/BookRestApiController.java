package com.book.store.app.bookstoreapplication.restservice;

import com.book.store.app.bookstoreapplication.model.Book;
import com.book.store.app.bookstoreapplication.model.BookResponse;
import com.book.store.app.bookstoreapplication.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(value = "*")
@AllArgsConstructor
public class BookRestApiController {
    private BookRepository bookRepository;
    @GetMapping("/get-all-books")
    public List<BookResponse> getAllBooks(){
        List<Book> books=bookRepository.findAll();
        List<BookResponse> bookResponses=new ArrayList<>();
        String uri="http://localhost:8080/show-book-cover-img/";
        books.forEach(book -> {
            bookResponses.add(
                    BookResponse.builder()
                            .id(book.getBookId())
                            .productTitle(book.getBookName())
                            .description(book.getBookSummary())
                            .price(book.getPrice()+"")
                            .thumnail(uri+book.getBookId())
                            .build()
            );
        });
        return bookResponses;
    }
}
