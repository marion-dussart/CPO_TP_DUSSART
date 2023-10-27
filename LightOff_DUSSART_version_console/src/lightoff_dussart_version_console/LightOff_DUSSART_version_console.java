/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_dussart_version_console;

/**
 *
 * @author mario
 */
public class LightOff_DUSSART_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Partie partie1 = new Partie();
        partie1.initialiserPartie(10);
        partie1.setNbCoupsMax(2);
        partie1.lancerPartie();
    }
    
    
    
    
}
