/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_dussart_version_console;

/**
 *
 * @author mario
 */
public class GrilleDeJeu {
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    /**
     *Constructeur pour créer une grille de jeu avec le nombre
     * @param p_nbLignes
     * @param p_nbColonnes
     */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
            for (int i = 0; i < nbLignes;

    /**
     *
     */
    public void eteindreToutesLesCellules(){
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    
    public void activerLigneColonneOuDiagonaleAleatoire(){
        
    }
    
    public void melangerMatriceAleatoirement(int nbTours){
        this.eteindreToutesLesCellules();
        for (int i=0; i<nbTours; i++) activerLigneColonneOuDiagonaleAleatoire
    }
    
    public void activerLigneDeCellule(int idLigne) {
        for (int i=0; i< nbColonnes; i++){
            grille[idLigne][i].activerCellule();
        }
    }
}
