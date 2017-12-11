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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author el ouali
 */
@Entity
@Table(name="Tarif")
public class Tarif implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String DateDebut;
    private String DateFin;
    private double Prix;
    @ManyToOne
    private Planning planningtarif;

    public Tarif() {
    }

    public Planning getPlanningtarif() {
        return planningtarif;
    }

    public void setPlanningtarif(Planning planningtarif) {
        this.planningtarif = planningtarif;
    }
    
    public Tarif(String DateDebut, String DateFin, double Prix) {
        this.DateDebut = DateDebut;
        this.DateFin = DateFin;
        this.Prix = Prix;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(String DateDebut) {
        this.DateDebut = DateDebut;
    }

    public String getDateFin() {
        return DateFin;
    }

    public void setDateFin(String DateFin) {
        this.DateFin = DateFin;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double Prix) {
        this.Prix = Prix;
    }
    
}
