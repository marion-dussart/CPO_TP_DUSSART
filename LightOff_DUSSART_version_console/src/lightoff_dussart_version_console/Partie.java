/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_dussart_version_console;

import java.util.Scanner;

/**
 *Permet de jouer au jeu en facilitant l'interaction entre le joueur et la grille
 * @author mario
 */
public class Partie {
    private GrilleDeJeu grille; 
    private int nbCoups; 
    
    /**
     *Génère une nouvelle grille de cellules
     * et initialise le compteur nbCoups à zéro
     * @param nbLignes le nombre de ligne dans la grille
     * @param nbColonnes le nombre de colonne dans la grille
     */
    public Partie(int nbLignes, int nbColonnes) {
        grille = new GrilleDeJeu(nbLignes, nbColonnes);
        nbCoups = 0;
    }
    
    /**
     *Initialise la partie en virifiant si le grille est bien mélanger aléatoirement
     * @param nbTours
     */
    public void initialiserPartie(int nbTours) {
        grille.melangerMatriceAleatoirement(nbTours);
    }

    /**
     *Permet de jouer au jeu
     *Elle affiche la grille initiale et utilise une boucle pour que le jeu continue 
     */
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);

        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Etat actuel de la grille :");
            System.out.println(grille.toString());

            System.out.println("Entrez un coup (ligne, colonne ou diagonale) : ");
            String coup = scanner.nextLine();

            if (coup.length() < 2) {
                System.out.println("Entree invalide. Utilisez un format tel que L2 (Ligne), C3 (Colonne) ou D (Diagonale).");
                return;
            }

            char action = coup.charAt(0);
            int index = Character.getNumericValue(coup.charAt(1));

            switch (action) {
                case 'L':
                    grille.activerLigneDeCellules(index);
                    break;
                case 'C':
                    grille.activerColonneDeCellules(index);
                    break;
                case 'D':
                    if (index == 0) {
                    grille.activerDiagonaleDescendante();
                    } else if (index == 1) {
                        grille.activerDiagonaleMontante();
                    } else {
                        System.out.println("Index de diagonale invalide. Utilisez 0 pour descendante ou 1 pour montante.");
                    }
                    break;
                default:
                    System.out.println("Action invalide. Utilisez L pour ligne, C pour colonne ou D pour diagonale.");
            }
            nbCoups++;
        }

        System.out.println("Toutes les cellules sont éteintes ! Nombre de coups : " + nbCoups);
    }
}
    
