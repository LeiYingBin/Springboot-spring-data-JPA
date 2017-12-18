package com.lyb.service;

import com.lyb.domain.Drug;

public interface DrugService {

    Drug findById(String id);
//    Drug findByName(String id);
    String addDrug(Drug drug);
    String updateDrug(Drug drug);
}
