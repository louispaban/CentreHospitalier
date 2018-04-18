/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author louispaban
 */
public class ProjetJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
    
      
        ArrayList <String> liste;
        String requete3 = null; 
        Connexion connexion = new Connexion("hopital","root","root");        
        liste = connexion.remplirChampsRequete(requete3);
        System.out.println(liste);
        
    
    }
/*
    private static class Connexion {

        public Connexion() {
        }

        private Connexion(String hopital, String root, String root0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private ArrayList<String> remplirChampsRequete(String requete3) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }*/
        
    }

    
