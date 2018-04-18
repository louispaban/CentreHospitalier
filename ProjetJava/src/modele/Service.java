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

public class Service {
    
    private int code; 
    private String nom; 
    private String batiment; 
    private int directeur; 
    
    
/*
 * Constructeur surchargé
 */  
public Service(int code, String nom, String batiment, int directeur) {
        
    this.code = code;
    this.nom = nom;
    this.batiment = batiment;
    this.directeur = directeur;
}

}
   



