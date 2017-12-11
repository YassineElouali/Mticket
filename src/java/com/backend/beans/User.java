/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author el ouali
 */
@Entity
@Table(name="User")
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UserId;
    private String Email;
    private String Mdps;

    public User(String Email, String Mdps) {
        this.Email = Email;
        this.Mdps = Mdps;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" + "UserId=" + UserId + ", Email=" + Email + ", Mdps=" + Mdps + '}';
    }
    
    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMdps() {
        return Mdps;
    }

    public void setMdps(String Mdps) {
        this.Mdps = Mdps;
    }

    
}
