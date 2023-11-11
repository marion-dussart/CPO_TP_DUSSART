package lightoff_dussart_version_console;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author mario
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    GrilleDeJeu grille;
    int nbCoups;
    int i;

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        int nbLignes = 5;
        int nbColonnes = 5;
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, nbColonnes * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
            }
        }
        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();

        PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes)); // Inverser les arguments pour avoir 1 ligne et plusieurs colonnes

        int PositionEnBas = (nbLignes * 40) + 40;
        int PositionEnBas2 = 130 + (nbColonnes * 40);

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, PositionEnBas, nbColonnes * 40, 1 * 40)); // Ajuster les dimensions pour la grille horizontale
        this.pack();
        this.revalidate();

        PanneauBoutonsDMontante.setLayout(new GridLayout(1, 1));
        getContentPane().add(PanneauBoutonsDMontante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, PositionEnBas - 5, 40, 40));
        this.pack();
        this.revalidate();

        PanneauBoutonsDDescendante.setLayout(new GridLayout(1, 1));
        getContentPane().add(PanneauBoutonsDDescendante, new org.netbeans.lib.awtextra.AbsoluteConstraints(PositionEnBas2, PositionEnBas - 5, 40, 40));
        this.pack();
        this.revalidate();

        // création du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                }

            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);
        }

        for (i = 0; i < nbColonnes; i++) {
            JButton bouton_Colonnes = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                }

            };

            bouton_Colonnes.addActionListener(ecouteurClick);
            PanneauBoutonsHorizontaux.add(bouton_Colonnes);
        }

        // création du panneau de boutons diag montante
        JButton bouton_diag1 = new JButton();
        ActionListener ecouteurClick = new ActionListener() {
            final int j = i;

            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleMontante();

            }
        };
        bouton_diag1.addActionListener(ecouteurClick);
        PanneauBoutonsDMontante.add(bouton_diag1);

        // création du panneau de boutons diag DESCENDANTE
        JButton bouton_diag2 = new JButton();
        ActionListener ecouteurClick2 = new ActionListener() {
            final int j = i;

            @Override
            public void actionPerformed(ActionEvent e) {
                grille.activerDiagonaleDescendante();
            }
        };
        bouton_diag2.addActionListener(ecouteurClick2);
        PanneauBoutonsDDescendante.add(bouton_diag2);

    }

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        PanneauBoutonsDDescendante = new javax.swing.JPanel();
        PanneauBoutonsDMontante = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setPreferredSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(102, 102, 255));
        PanneauGrille.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 500, 410));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 410));

        PanneauBoutonsHorizontaux.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 360, 40));
        PanneauBoutonsHorizontaux.getAccessibleContext().setAccessibleName("");

        PanneauBoutonsDDescendante.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout PanneauBoutonsDDescendanteLayout = new javax.swing.GroupLayout(PanneauBoutonsDDescendante);
        PanneauBoutonsDDescendante.setLayout(PanneauBoutonsDDescendanteLayout);
        PanneauBoutonsDDescendanteLayout.setHorizontalGroup(
            PanneauBoutonsDDescendanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauBoutonsDDescendanteLayout.setVerticalGroup(
            PanneauBoutonsDDescendanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsDDescendante, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

        PanneauBoutonsDMontante.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout PanneauBoutonsDMontanteLayout = new javax.swing.GroupLayout(PanneauBoutonsDMontante);
        PanneauBoutonsDMontante.setLayout(PanneauBoutonsDMontanteLayout);
        PanneauBoutonsDMontanteLayout.setHorizontalGroup(
            PanneauBoutonsDMontanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauBoutonsDMontanteLayout.setVerticalGroup(
            PanneauBoutonsDMontanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsDMontante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonsDDescendante;
    private javax.swing.JPanel PanneauBoutonsDMontante;
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    // End of variables declaration//GEN-END:variables
}
