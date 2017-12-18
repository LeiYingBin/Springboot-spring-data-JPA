package com.lyb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 用户实体类
 *
 * Created by bysocket on 21/07/2017.
 */
@Entity
public class User implements Serializable {

    /**
     * 编号
     */
    @Id
    @GeneratedValue
    private String userid;

   @Column
    private String username;

    /**
     * pwd
     */
    @Column
    private String password;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
