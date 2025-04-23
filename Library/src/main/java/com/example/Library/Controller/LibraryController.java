package com.example.Library.Controller;

import com.example.Library.Service.LibraryService;
import com.example.Library.dto.CountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/count")
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @PostMapping("/insert")
    public void insert(@RequestBody CountDTO countDTO){
        libraryService.insert(countDTO);
    }
}
