package com.lyb.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFilter;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "drug_num")
    private String drug_num;

    @Column(name = "drug_name")
    private String drug_name;

    @Column(name = "amount")
    private int amount ;

    @Column(name = "restate")
    private String restate;

    @Temporal(TemporalType.DATE)
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date inventory_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDrug_num() {
        return drug_num;
    }

    public void setDrug_num(String drug_num) {
        this.drug_num = drug_num;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRestate() {
        return restate;
    }

    public void setRestate(String restate) {
        this.restate = restate;
    }

    public Date getInventory_time() {
        return inventory_time;
    }

    public void setInventory_time(Date inventory_time) {
        this.inventory_time = inventory_time;
    }

}
