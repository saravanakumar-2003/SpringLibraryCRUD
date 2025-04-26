package com.example.Library.Controller;

import com.example.Library.Service.ReaderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ReaderBookController {

    @Autowired
    ReaderBookService readerBookService;

    @PutMapping("/issueBook")
    public void issueBook(@RequestParam String readerName, String bookName){

        readerBookService.issueBook(readerName,bookName);

    }

    @PutMapping("/returnBook")
    public void returnBook(@RequestParam String readerName, String bookName){
        readerBookService.returnBook(readerName, bookName);
    }
}
