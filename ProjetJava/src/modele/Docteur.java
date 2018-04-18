/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author louispaban
 * Classe fille, héritée de la classe Employe
 */
public class Docteur extends Employe{
    
    private String specialite;

/*
 * Constructeur par défaut hérité
 */
    
public Docteur() {
        
    super();
    specialite = null;
    }
/*
 * Constructeur surchargé
 */    
    
public Docteur(int numeroEmploye, String nom, String prenom, int numeroTelephone, String adresse, String specialite) {
       
    super(numeroEmploye, nom, prenom, numeroTelephone, adresse);
    this.specialite = specialite;
    }
    
    
    
}