/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_dussart;

/**
 *
 * @author mario
 */
public class Epee extends Arme {
    String Nom ;
    double Finesse;


    public Epee(String Nom, double Finess){
        this.Nom = Nom;
        this.Finesse = Finesse;

    @Override
    public String toString() {
        return "Epee{" + "Nom=" + Nom + ", Finesse=" + Finesse +"}";
    }
}  
}
