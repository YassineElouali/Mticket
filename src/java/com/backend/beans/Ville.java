/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backend.beans;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author el ouali
 */
@Entity
@Table(name="Ville")
public class Ville {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int IdVille;
    private String NomVille;
    private String CodePostal;
    @OneToMany(mappedBy = "villeDepart")
    private List<Trajet> trajets;

    public Ville() {
    }

    
    public int getIdVille() {
        return IdVille;
    }

    public void setIdVille(int IdVille) {
        this.IdVille = IdVille;
    }

    public String getNomVille() {
        return NomVille;
    }

    public void setNomVille(String NomVille) {
        this.NomVille = NomVille;
    }

    public String getCodePostal() {
        return CodePostal;
    }

    public void setCodePostal(String CodePostal) {
        this.CodePostal = CodePostal;
    }

    public List<Trajet> getTrajets() {
        return trajets;
    }

    public void setTrajets(List<Trajet> trajets) {
        this.trajets = trajets;
    }
    
    
}
