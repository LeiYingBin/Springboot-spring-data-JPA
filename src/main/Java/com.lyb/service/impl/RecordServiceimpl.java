package com.lyb.service.impl;

import com.lyb.domain.Record;
import com.lyb.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceimpl implements RecordService {

    @Autowired
    RecordService recordService;

    @Override
    public Record findByIdorName(String id) {
        return null;
    }

    @Override
    public Record findAll() {
        return null;
    }
}
