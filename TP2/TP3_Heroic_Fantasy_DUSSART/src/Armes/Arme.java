/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author mario
 */
   public abstract class Arme {
    String Nom ;
    int Attaque ;


    public Arme(String Nom, int Attaque) {
        this.Nom = Nom;
        this.Attaque = Attaque;
    }
    
    public String getNom() {
        return Nom;
    }
    
    public int getAttaque() {
        return Attaque;
    }
    
    @Override
    public String toString() {
        return "Arme{" + "Nom=" + Nom + ", Attaque=" + Attaque +"}";
    }

    public static class arme {

        public arme() {
        }
    }

}