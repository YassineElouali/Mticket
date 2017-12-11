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
@Table(name="Trajet")
public class Trajet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Distance;
    private String Duree;
    @ManyToOne
    private Ville villeDepart;
    @ManyToOne
    private Ville villeArrive;
    @ManyToOne
    private Planning planningtrajet;

    public Planning getPlanningtrajet() {
        return planningtrajet;
    }

    public void setPlanning(Planning planning) {
        this.planningtrajet = planning;
    }
    
    public Trajet() {
    }

    public Ville getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(Ville villeDepart) {
        this.villeDepart = villeDepart;
    }

    public Ville getVilleArrive() {
        return villeArrive;
    }

    public void setVilleArrive(Ville villeArrive) {
        this.villeArrive = villeArrive;
    }
    

    

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getDistance() {
        return Distance;
    }

    public void setDistance(String Distance) {
        this.Distance = Distance;
    }

    public String getDuree() {
        return Duree;
    }

    public void setDuree(String Duree) {
        this.Duree = Duree;
    }

    @Override
    public String toString() {
        return "Trajet{" + "Id=" + Id + ", Distance=" + Distance + ", Duree=" + Duree + '}';
    }
    
    
}
