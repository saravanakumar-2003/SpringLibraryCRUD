package com.example.Library.Service;

import com.example.Library.Entity.BookEntity;
import com.example.Library.Entity.ReaderEntity;
import com.example.Library.Repository.BookRepository;
import com.example.Library.Repository.ReaderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderBookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    ReaderRepository readerRepository;

    @Autowired
    BookService bookService;

    @Transactional
    public void issueBook(String readerName, String bookName){

        BookEntity book = bookRepository.findByTitle(bookName);
        int bookId = book.getBookId();

        ReaderEntity reader = readerRepository.findByName(readerName);
        int readerId = reader.getId();

        bookService.issueBook(bookId, readerId);
    }
}
