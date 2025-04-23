package com.example.Library.Repository;

import com.example.Library.Entity.ReaderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<ReaderEntity, Integer> {
    ReaderEntity findByName(String readerName);
}
