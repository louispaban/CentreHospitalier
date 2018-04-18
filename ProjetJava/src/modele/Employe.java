/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author louispaban
 */
public class Employe {
    
/*
 * Attributs de la classe mère Employe
 */
    protected int numeroEmploye;
    protected String nom;
    protected String prenom;
    protected int numeroTelephone;
    protected String adresse;
    
/*
 * Constructeur par défaut
 */   
    
public Employe() {
     
    numeroEmploye = 0;
    nom = null;
    prenom = null;
    numeroTelephone = 0;
    adresse = null;
    }
    
/*
 * Constructeur surchargé
 */
   
public Employe(int numeroEmploye, String nom, String prenom, int numeroTelephone, String adresse) {
       
    this.numeroEmploye = numeroEmploye;
    this.nom = nom;
    this.prenom = prenom;
    this.numeroTelephone = numeroTelephone;
    this.adresse = adresse;
    }
    
}

