package com.lyb.service;

import com.lyb.domain.Record;
import com.lyb.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecordService {

    Record findById(Long id);
    List<Record> findAll();
    Record saveRecord(Record record);
}
