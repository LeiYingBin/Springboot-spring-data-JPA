package com.lyb.service.impl;

import com.lyb.domain.Drug;
import com.lyb.domain.DrugRepository;
import com.lyb.service.DrugService;
import org.hibernate.annotations.SQLInsert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugServiceimpl implements DrugService {

    @Autowired
    DrugRepository drugRepository;

    @Override
    public String updateDrug(Drug drug) {
        drugRepository.saveAndFlush(drug);
        return "true";
    }



    @Override
    public Drug addDrug(Drug drug) {
        drugRepository.save(drug);
        return null;
    }

    @Override
    public String deleteDrug(String drug_num) {
        Drug drug = drugRepository.findById(drug_num).get();
        drug.setDrug_state(1);
        updateDrug(drug);
        return "true";
    }

    @Override
    @Query("select drug from drug drug where drug_state=0")
    public List<Drug> findAll() {
        return drugRepository.findAll();
    }

    @Override
    public Drug findById(String id) {
        if(drugRepository.findById(id).isPresent())
            return drugRepository.findById(id).get();
        else
        return null;
    }
}
