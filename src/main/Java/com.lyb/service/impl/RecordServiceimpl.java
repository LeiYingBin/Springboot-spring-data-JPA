package com.lyb.service.impl;

import com.lyb.domain.Record;
import com.lyb.domain.RecordRepository;
import com.lyb.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RepositoryDefinition(domainClass = Record.class, idClass = Integer.class)
public class RecordServiceimpl implements RecordService {

    @Autowired
    RecordRepository recordRepository;

    @Override
    public Record findById(int id) {
        return recordRepository.findById(id).get();
    }

    @Override
    public Record insertByRecord(Record record) {
        return  recordRepository.save(record);
    }

    @Override
    public List<Record> findAll() {
        return recordRepository.findAll();
    }
}
