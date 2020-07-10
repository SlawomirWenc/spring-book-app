package com.example.LibraryApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class BookController {

    private BookRepo bookRepo;

    @Autowired
    public BookController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Iterable<Book> findAll(){
        return bookRepo.findAll();
    }

    public Book addBook(Book book){
        return bookRepo.save(book);
    }

    public void deleteById(Long id){
        bookRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        bookRepo.save(new Book(1L,"Pułapki myślenia","Daniel Kahneman"));
        bookRepo.save(new Book(2L,"Zrozumieć programowanie","Coldwind Gynvael"));
        bookRepo.save(new Book(3L,"Wprowadzenie do algorytmów","Rivest Ronald"));
    }

}
