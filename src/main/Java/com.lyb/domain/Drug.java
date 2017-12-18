package com.lyb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Drug {
    @Id
    @GeneratedValue
    private String systemid;

    @Column
    private String drug_num;

    @Column
    private String drug_name;

    @Column
    private String price;

    @Column
    private String type;

    @Column
    private int number;

    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
