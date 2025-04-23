package com.example.Library.Controller;

import com.example.Library.Entity.ReaderEntity;
import com.example.Library.Service.ReaderService;
import com.example.Library.dto.ReaderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/reader")
public class ReaderController {

    @Autowired
    ReaderService readerService;

    @PostMapping("/insert")
    public void insert(@RequestBody ReaderDTO readerDTO){

        readerService.insert(readerDTO);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id){
        readerService.delete(id);
    }

    @GetMapping("/display")
    public List<ReaderEntity> display(){
        return readerService.display();
    }
}
