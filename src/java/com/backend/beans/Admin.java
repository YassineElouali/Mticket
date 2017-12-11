/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author el ouali
 */
@Entity
@Table(name="Admin")
public class Admin extends User {

   private String NomAdmin;
   private String PrenomAdmin;

    public Admin(String NomAdmin, String PrenomAdmin, String Email, String Mdps) {
        super(Email, Mdps);
        this.NomAdmin = NomAdmin;
        this.PrenomAdmin = PrenomAdmin;
    }

    public Admin() {
       
    }

    public String getNomAdmin() {
        return NomAdmin;
    }

    public void setNomAdmin(String NomAdmin) {
        this.NomAdmin = NomAdmin;
    }

    public String getPrenomAdmin() {
        return PrenomAdmin;
    }

    public void setPrenomAdmin(String PrenomAdmin) {
        this.PrenomAdmin = PrenomAdmin;
    }

    @Override
    public String toString() {
        return "Admin{" + "NomAdmin=" + NomAdmin + ", PrenomAdmin=" + PrenomAdmin + '}';
    }
   
    
    
}
