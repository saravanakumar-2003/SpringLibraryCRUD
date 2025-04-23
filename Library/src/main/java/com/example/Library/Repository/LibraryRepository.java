package com.example.Library.Repository;


import com.example.Library.Entity.LibraryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<LibraryEntity, Integer> {

    @Modifying

    @Query("UPDATE LibraryEntity library SET library.totalNoOfBooks = library.totalNoOfBooks + 1 WHERE id = 0")
    void increment();

    @Query("UPDATE LibraryEntity library SET library.totalNoOfBooks = library.totalNoOfBooks - 1 WHERE id = 0")
    void decrement();
}

