package com.lyb.service;

import com.lyb.domain.Drug;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DrugService {

    Drug findById(String id);
    Drug addDrug(Drug drug);
    String updateDrug(Drug drug);
    List<Drug> findAll();
    String deleteDrug(String drug_num);
}
