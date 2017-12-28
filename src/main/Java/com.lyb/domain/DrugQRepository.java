package com.lyb.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DrugQRepository extends JpaRepository<Drug,String> {

    @Query("select drug from Drug drug where drug.drug_num like %:number% or drug.drug_name like %:name% ")
    List<Drug> findByNumberOrName(@Param("number")String number,@Param("name")String name);

}


