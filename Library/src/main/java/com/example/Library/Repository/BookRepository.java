package com.example.Library.Repository;

import com.example.Library.Entity.BookEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer>{


    BookEntity findByTitle(String bookName);

    @Modifying
    @Query("UPDATE BookEntity be SET be.readerId = :readerId WHERE be.bookId = :bookId")
    void issueBook(@Param("bookId") int bookId,@Param("readerId") int readerId);
}