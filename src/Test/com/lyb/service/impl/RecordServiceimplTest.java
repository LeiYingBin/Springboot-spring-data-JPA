package com.lyb.service.impl;

import com.lyb.domain.Record;
import com.lyb.domain.RecordRepository;
import com.lyb.service.RecordService;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.security.RunAs;
import java.util.Date;


@SpringBootTest
public class RecordServiceimplTest extends TestCase {

    @Autowired
    RecordService recordService;

    @Autowired
    RecordRepository recordRepository;

    public void testFindById() {
    }

    public void testInsertByRecord() {
        Record record = new Record();
        record.setDrug_num("H20090316");
        record.setDrug_name("硫酸氨基葡萄糖胶囊");
        record.setAmount(10);
        record.setRestate("1");
//        record.setInventory_time(new Date());
//        recordRepository.save(record);
        recordService.saveRecord(record);

    }

    public void testFindAll() {
    }
}