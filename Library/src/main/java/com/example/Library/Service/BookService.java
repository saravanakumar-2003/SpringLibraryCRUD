package com.example.Library.Service;


import com.example.Library.Entity.BookEntity;
import com.example.Library.Repository.BookRepository;
import com.example.Library.dto.BookDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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

    @Transactional
    public void delete(int bookId){
        Optional<BookEntity> book = bookRepository.findById(bookId);
        if(book.isPresent()){
            BookEntity bk = book.get();
            if(bk.getReader() != null){
                bookRepository.decrement();
            }
        }
        bookRepository.deleteById(bookId);
        libraryService.decrementBook();
    }

    public List<BookEntity> display(){
        return bookRepository.findAll();
    }

    public void issueBook(int bookId, int readerId){
        bookRepository.issueBook(bookId, readerId);
    }

    public void returnBook(int bookId, int readerId) {
        bookRepository.returnBook(bookId, readerId);
    }
}
