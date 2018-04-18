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

public class Chambre {

/* attributs de la classe Chambre
 *
 */
    private int numeroChambre;
    private int codeService;
    private int surveillant; 
    private int nb_lits;
    
/*
 * constructeur par défaut inatialisant les attributs
 */

public Chambre() {
        
    numeroChambre =0;
    codeService = 0;
    surveillant = 0;
    nb_lits = 0;
    }

/*
 * constructeur surchargé
 */

public Chambre(int numero, int codeService, int surveillant, int nb_lits) {
        
    this.numeroChambre = numero;
    this.codeService = codeService;
    this.surveillant = surveillant;
    this.nb_lits = nb_lits;
    }
    
}