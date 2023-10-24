/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author mario
 */
public class Epee extends Arme {
    String Nom ;
    int Finesse;


    public Epee (String Nom, int attaque, int Finesse){
        super(Nom, attaque);
        this.Finesse = Finesse;
    }
    
    @Override
    public String toString() {
        return "Epee{" + "Nom=" + Nom + ", Finesse=" + Finesse +"}";
    }
}  

