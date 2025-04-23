package com.example.Library.Controller;

import com.example.Library.Entity.BookEntity;
import com.example.Library.Service.BookService;
import com.example.Library.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/insert")
    public void insert(@RequestBody BookDTO bookDTO){
        bookService.insert(bookDTO);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody int bookId){
        bookService.delete(bookId);
    }

    @GetMapping("/display")
    public List<BookEntity> display(){
        return bookService.display();
    }
}
