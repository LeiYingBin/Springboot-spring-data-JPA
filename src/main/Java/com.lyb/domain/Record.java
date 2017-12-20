package com.lyb.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFilter;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Record {

    @Id
    @GeneratedValue
    private int serial_num;

    @Column
    private String drug_num;

    @Column
    private String drug_name;

    @Column
    private int amount ;

    @Column
    private String restate;

    @Temporal(TemporalType.DATE)
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date inventory_time;

    public int getSerial_num() {
        return serial_num;
    }

    public void setSerial_num(int serial_num) {
        this.serial_num = serial_num;
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
