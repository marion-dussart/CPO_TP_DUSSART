/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_dussart_version_console;

/**
 * Classe qui défini l'etat de la cellule (allumée ou éteinte)
 * @author mario
 */
public class CelluleLumineuse {

    private boolean etat;

    /**
     * Initailise par défaut l'état eteint de la cellule
     */
    public CelluleLumineuse() {
        etat = false;
    }

    /**
     * Permet d'activer la cellule en inversant son état
     */
    public void activerCellule() {
        etat = !etat;
    }

    /**
     * Eteint la cellule
     */
    public void eteindreCellule() {
        etat = false;
    }

    /**
     * Vérifie si la cellule est éteinte
     * @return "true" si la cellule est eteinte et "false" si elle est allumée
     */
    public boolean estEteint() {
        return !etat;
    }

    /**
     * Obteint l'état actuel de la cellule
     * @return son état : eteint ou allumé
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * Affiche l'état de la cellule de manière lisible
     * @return "X" si la cellule est allumé et "O" si la cellule est eteinte
     */
    @Override
    public String toString() {
        if (etat) {
            return "X"; // Allumée
        } else {
            return "O"; // Éteinte
        }
    }

}
