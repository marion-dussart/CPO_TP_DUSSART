/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_dussart_version_console;
import java.util.Random;

/**
 *Permet de générer, activer, éteindre et afficher l'état des cellules de manière structurée
 * @author mario
 */
public class GrilleDeJeu {
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    /**
     * Permet de créer une nouvelle grille de cellules
     * @param p_nbLignes     Nombre de lignes de la grille.
     * @param p_nbColonnes   Nombre de colonnes de la grille.
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * Éteint toutes les cellules de la grille.
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    } 
  
    /**
     * Active de manière aléatoire une ligne, une colonne ou une diagonale de cellules.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choice = random.nextInt(3); // Generates a random number between 0 and 2
        
        switch (choice) {
            case 0:
                int randomRow = random.nextInt(nbLignes);
                activerLigneDeCellules(randomRow);
                break;
            case 1:
                int randomCol = random.nextInt(nbColonnes);
                activerColonneDeCellules(randomCol);
                break;
            case 2:
                if (random.nextBoolean()) {
                    activerDiagonaleDescendante();
                } else {
                    activerDiagonaleMontante();
                }
                break;
            default:
                break;
        }
    }
     
    /**
     * Génére un plateau de cellules lumineuses de manière aléatoire à partir d’un nombre spécifié de tours
     * @param nbTours le nombre de tours 
     */
    public void melangerMatriceAleatoirement(int nbTours){
        this.eteindreToutesLesCellules();
        for (int i=0; i<nbTours; i++) activerLigneColonneOuDiagonaleAleatoire();
    }
    
    /**
    * Change l'état de toutes les cellules de la ligne
    * @param idLigne numéro de la ligne à changer
    */
    public void activerLigneDeCellules(int idLigne) {
        for (int colonne = 0; colonne < nbColonnes; colonne++) {
            matriceCellules[idLigne][colonne].activerCellule();
        }
    }

    /**
     * Change l'état de toutes les cellules de la colonne
    * @param idColonne numéro de la colonne à changer.
    */
    public void activerColonneDeCellules(int idColonne) {
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            matriceCellules[ligne][idColonne].activerCellule();
        }
    }
    
    
    /**
    * Active la diagonale descendante de la grille en allumant les cellules correspondantes.
    */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
    * Active la diagonale montante de la grille en allumant les cellules correspondantes.
    */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }
    
    public int combiendecellulesencoreallumés() {
        int ntotalcellules = nbLignes*nbColonnes ;
        int nbrCelluleseteintes = 0;

        for (int ligne = 0; ligne < nbLignes; ligne++) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                if (!matriceCellules[ligne][colonne].estEteint()) { 
                    nbrCelluleseteintes++;
                }
            }
        }
        
        int nbrCellulesEncoreAllumés = ntotalcellules - nbrCelluleseteintes ;

        return nbrCellulesEncoreAllumés;
    }
    
    
    
    
    
    
    /**
    * Vérifie si toutes les cellules de la grille sont éteintes.
    * @return "true" si elles sont toutes éteintes, sinon "false".
    */
    public boolean cellulesToutesEteintes() {
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                if (matriceCellules[ligne][colonne].estEteint()) {
                    return false;
                }
            }
        }
        return true; 
    }

    /**
    * Génère une représentation visuelle organisée de la grille 
    * les caractères 'X' et 'O' pour représenter l'état des cellules.
    *
    * @return Une chaîne de caractères représentant l'état de la grille.
    */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  |");
        for (int i = 0; i < nbColonnes; i++) {
            sb.append(" " + i + " |");
        }
        sb.append("\n");
        sb.append("--|");
        for (int i = 0; i < nbColonnes; i++) {
            sb.append("---|");
        }
        sb.append("\n");
        for (int i = 0; i < nbLignes; i++) {
            sb.append(i + " |");
            for (int j = 0; j < nbColonnes; j++) {
                sb.append(" " + (matriceCellules[i][j].getEtat() ? "X" : "O") + " |");
            }
            sb.append("\n");
            sb.append("--|");
            for (int j = 0; j < nbColonnes; j++) {
                sb.append("---|");
            }
            sb.append("\n");
        }
    
        return sb.toString();
    }
}