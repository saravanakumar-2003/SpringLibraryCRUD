package com.example.Library.Service;


import com.example.Library.Entity.BookEntity;
import com.example.Library.Repository.BookRepository;
import com.example.Library.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    LibraryService libraryService;

    public void insert(BookDTO bookDTO){
        BookEntity bookEntity = new BookEntity();
        bookEntity.setAuthor(bookDTO.getAuthor());
        bookEntity.setGenre((bookDTO.getGenre()));
        bookEntity.setTitle(bookDTO.getTitle());
        bookEntity.setPublisher((bookDTO.getPublisher()));
        bookEntity.setNoOfPages((bookDTO.getNoOfPages()));
        bookRepository.save(bookEntity);
        libraryService.incrementBook();
    }

    public void delete(int bookId){
        bookRepository.deleteById(bookId);
        libraryService.decrementBook();
    }

    public List<BookEntity> display(){
        return bookRepository.findAll();
    }

    public void issueBook(int bookId, int readerId){
        bookRepository.issueBook(bookId, readerId);
    }
}
