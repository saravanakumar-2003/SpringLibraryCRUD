package com.example.Library.Repository;

import com.example.Library.Entity.ReaderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<ReaderEntity, Integer> {
    ReaderEntity findByName(String readerName);

    @Modifying
    @Query("UPDATE LibraryEntity le SET le.totalNoOfReaders = le.totalNoOfReaders + 1 WHERE le.id = 0")
    void increment();
}
