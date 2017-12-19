package com.lyb.service.impl;

import com.lyb.domain.Drug;
import com.lyb.domain.DrugRepository;
import com.lyb.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugServiceimpl implements DrugService {

    @Autowired
    DrugRepository drugRepository;

    @Override
    public String updateDrug(Drug drug) {
        return null;
    }

    @Override
    public String addDrug(Drug drug) {
        drugRepository.save(drug);
        return null;
    }

    @Override
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
