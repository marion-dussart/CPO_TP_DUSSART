/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_dussart;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import Personnages.Personnages;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Arme.*;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class TP3_Heroic_Fantasy_DUSSART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Arme Epee1 = new Epee ("Excalbur", 7,5 ) ;
Arme Epee2 = new Epee ("Durandal", 4,5 ) ;

Arme Baton1 = new Baton ("Chene", 4,5 ) ;
Arme Baton2 = new Baton ("Charme", 5,6 ) ;
    
        ArrayList<Arme> liste = new ArrayList<Arme>();
        
        liste.add(Epee1);
        liste.add(Epee2);
        
        liste.add(Baton1);
        liste.add(Baton2);
        
        int taille = liste.size();
        System.out.println("Taille du vecteur : " + taille);
        
        for (int i = 0; i < liste.size(); i++) {
            Arme arme = liste.get(i);
            System.out.println("Arme : " + arme.getNom());
            System.out.println("Degats : " + arme.getAttaque());
            System.out.println();
        }
    
    Magicien magi1 = new Magicien ("Gandalf", 65, true);
        System.out.println(Arme.get(taille-1));
        Magicien magi2 = new Magicien ("Garcimor", 44, false);
        Guerrier g1 = new Guerrier ("Conan", 78, false);
        Guerrier g2 = new Guerrier ("Lannister", 45, true);
        
        ArrayList<Personnages> tab_p = new ArrayList<Personnages>();
        tab_p.add(magi1);
        tab_p.add(magi2);
        tab_p.add(g1);
        tab_p.add(g2);
        
        int taille2 =tab_p.size();
        
        int longueur2=taille2-1;
        for (int i=0 ; i<longueur2; i++){
            System.out.println(tab_p.get(i));
            
        
        Guerrier g3 = new Guerrier("océane le troll", 2, false);
        Magicien m3 = new Magicien ("jules le gobelin", 8, false);
        Baton Baton10 = new Baton ("branche", 5 , 5);
        Baton Baton11 = new Baton ("branche2", 5 , 5);
        Baton Baton12 = new Baton ("branche3", 5 , 5);     
        
      Epee Epee10 = new Epee ("kalisce", 5, 6);
      Epee Epee11 = new Epee ("kalisce2", 5, 6);
      Epee Epee12 = new Epee ("kalisce3", 5, 6);
        
        g3.ajouter_arme(Epee10);
        g3.ajouter_arme(Epee11);
        g3.ajouter_arme(Epee12);
        
        m3.ajouter_arme(Baton10);
        m3.ajouter_arme(Baton11);
        m3.ajouter_arme(Baton12);

        g3.équiper_arme("kalisce");
        System.out.println("ici");
        System.out.println(g3);
        System.out.println("ici");   
        
    }
    
}
}
