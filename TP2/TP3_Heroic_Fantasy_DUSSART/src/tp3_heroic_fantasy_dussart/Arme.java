/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_dussart;

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

    @Override
    public String toString() {
        return "Arme{" + "Nom=" + Nom + ", Attaque=" + Attaque +"}";
    }
}
}
