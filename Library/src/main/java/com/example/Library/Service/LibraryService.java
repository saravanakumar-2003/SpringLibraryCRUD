package com.example.Library.Service;

import com.example.Library.Entity.LibraryEntity;
import com.example.Library.Repository.LibraryRepository;
import com.example.Library.dto.CountDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    @Autowired
    LibraryRepository libraryRepository;

    public void insert(CountDTO countDTO){

        LibraryEntity libraryEntity = new LibraryEntity();

        libraryEntity.setTotalNoOfBooks(countDTO.getTotalNoOfBooks());
        libraryEntity.setBooksBorrowed(countDTO.getBooksBorrowed());
        libraryEntity.setTotalNoOfReaders(countDTO.getTotalNoOfReaders());
        libraryRepository.save(libraryEntity);
    }

    @Transactional
    public void incrementBook(){
        libraryRepository.increment();
    }

    @Transactional
    public void decrementBook() {
        libraryRepository.decrement();
    }

    @Transactional
    public void issueBook() {
        libraryRepository.issueBook();
    }
}
