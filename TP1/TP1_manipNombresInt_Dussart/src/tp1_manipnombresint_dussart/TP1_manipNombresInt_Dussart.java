/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_dussart;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class TP1_manipNombresInt_Dussart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int entier1 = sc.nextInt();

        // Utilisez la méthode nextInt() pour lire le deuxième entier saisi
        int entier2 = sc.nextInt();
        
        int somme = entier1 + entier2;
        int difference = entier1 - entier2;
        int produit = entier1 * entier2;        
        
        
        System.out.println("La somme des deux nombres est: "+somme+"\nLa difference des deux nombres est : "+difference+"\nLe produit des deux nombres est : "+produit);
        System.out.println("Le quotient de la division est : " + (entier1 / entier2));
        System.out.println("Le reste de la division est : " + (entier1 % entier2));
    }
    
}
