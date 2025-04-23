package com.example.Library.Service;

import com.example.Library.Entity.ReaderEntity;
import com.example.Library.Repository.ReaderRepository;
import com.example.Library.dto.ReaderDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReaderService {

    @Autowired
    ReaderRepository readerRepository;

    @Transactional
    public void insert(ReaderDTO readerDTO){

        ReaderEntity readerEntity = new ReaderEntity();

        readerEntity.setName(readerDTO.getName());
        readerEntity.setEmail((readerDTO.getEmail()));
        readerRepository.save(readerEntity);
        readerRepository.increment();
    }

    public void delete(int id) {


        readerRepository.deleteById(id);
    }

    public List<ReaderEntity> display() {
        return readerRepository.findAll();
    }
}
