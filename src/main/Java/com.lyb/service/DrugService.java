package com.lyb.service;

import com.lyb.domain.Drug;

import java.util.List;

public interface DrugService {

    Drug findById(String id);
//    Drug findByName(String id);
    Drug addDrug(Drug drug);
    String updateDrug(Drug drug);
    List<Drug> findAll();
}
