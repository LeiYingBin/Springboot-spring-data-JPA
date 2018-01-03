package com.lyb.domain;

import org.hibernate.annotations.SQLDelete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DrugQRepository extends JpaRepository<Drug,String> {

    @Query("select drug from Drug drug where drug.drug_num like CONCAT('%',:drug_num,'%')  and drug.drug_name like CONCAT('%',:drug_name,'%') and drug.drug_state=0  ")
    List<Drug> findByNumberOrName(@Param("drug_num")String number,@Param("drug_name")String name);

    @Query("select drug from Drug drug where  drug.drug_state=0  ")
    List<Drug> findAll();

}


