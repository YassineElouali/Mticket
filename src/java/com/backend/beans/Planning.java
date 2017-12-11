/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author el ouali
 */
@Entity
@Table(name="Planning")
public class Planning implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdPlanning;
    private String HeureDepart;
    private String HeureArrive;
    @OneToMany(mappedBy = "planningtrajets")
    private List<Trajet> trajets;
    @OneToMany(mappedBy = "planningtarifs")
    private List<Tarif> tarifs;
    @ManyToOne
    private Autocar autocar;
    @ManyToOne
    private Reservation reservation;

    public List<Trajet> getTrajets() {
        return trajets;
    }

    public void setTrajets(List<Trajet> trajets) {
        this.trajets = trajets;
    }

    public List<Tarif> getTarifs() {
        return tarifs;
    }

    public void setTarifs(List<Tarif> tarifs) {
        this.tarifs = tarifs;
    }

    public Autocar getAutocar() {
        return autocar;
    }

    public void setAutocar(Autocar autocar) {
        this.autocar = autocar;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    

    

    
    

    public Planning() {
    }

    public int getIdPlanning() {
        return IdPlanning;
    }

    public void setId(int Id) {
        this.IdPlanning = Id;
    }

    public String getHeureDepart() {
        return HeureDepart;
    }

    public void setHeureDepart(String HeureDepart) {
        this.HeureDepart = HeureDepart;
    }

    public String getHeureArrive() {
        return HeureArrive;
    }

    public void setHeureArrive(String HeureArrive) {
        this.HeureArrive = HeureArrive;
    }
    
    
}
