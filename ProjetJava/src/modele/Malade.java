/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import modele.Employe;

/**
 *
 * @author louispaban
 */
public class Malade extends Employe {
    
    private String mutuelle;
    
public Malade() {
        
    super();
    mutuelle = null;
    }
    
public Malade(int numeroEmploye, String nom, String prenom, int numeroTelephone, String adresse, String mutuelle) {
       
    super(numeroEmploye, nom, prenom, numeroTelephone, adresse);
    this.mutuelle = mutuelle;
        
    }
    
    }


