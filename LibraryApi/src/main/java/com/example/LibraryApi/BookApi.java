package com.example.LibraryApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookApi {

    private BookController bookController;

    @Autowired
    public BookApi(BookController bookController) {
        this.bookController = bookController;
    }

    @GetMapping
    public Iterable<Book> getAll(){
        return bookController.findAll();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookController.addBook(book);
    }

    @DeleteMapping
    public void deleteBook(@RequestParam Long id){
        bookController.deleteById(id);
    }

}
