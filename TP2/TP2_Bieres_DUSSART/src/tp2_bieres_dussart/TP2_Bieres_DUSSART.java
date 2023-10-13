/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_dussart;

/**
 *
 * @author mario
 */
public class TP2_Bieres_DUSSART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        //uneBiere.nom = "Cuvee des trolls";
        //uneBiere.degreAlcool = 7.0 ;
        //uneBiere.lireEtiquette();// TODO code application logic here
    
        //uneBiere.nom = "Leffe";
        //uneBiere.degreAlcool = 6.6 ;
        //uneBiere.brasserie = "Abbaye de Leffe";
        //uneBiere.lireEtiquette();// TODO code application logic h
    
        
       BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
       BouteilleBiere uneBiere2 = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        
        BouteilleBiere uneBiere3  = new BouteilleBiere("Sampe", 8.3 ,"Mas Du Pas De Loche") ;

        System.out.println(uneBiere) ;
        
        uneBiere3.Decapsuler();
        System.out.println(uneBiere3) ;                                                                                                                              
        
    }
    
}
