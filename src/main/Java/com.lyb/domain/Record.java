package com.lyb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Record {

    @Id
    @GeneratedValue
    private String serial_num;

    @Column
    private String drug_num;

    @Column
    private String drug_name;

    @Column
    private int amount ;

    @Column
    private String restate;

    @Column
    private Date time;

    public String getSerial_num() {
        return serial_num;
    }

    public void setSerial_num(String serial_num) {
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
