/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_dussart;

/**
 *
 * @author mario
 */
public class Baton extends Arme{
    String Nom ;
    double Age ;


    public Baton(String Nom, double Age){
        this.Nom = Nom;
        this.Age = Age;

    @Override
    public String toString() {
        return "Baton{" + "Nom=" + Nom + ", Age=" + Age +"}";
    }
}
}
