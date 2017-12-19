package com.lyb.service;

import com.lyb.domain.Record;
import com.lyb.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface RecordService {

    Record findByIdorName(String id);
    Record findAll();
}
