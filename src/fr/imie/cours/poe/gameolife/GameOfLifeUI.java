package fr.imie.cours.poe.gameolife;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

// le jeu est une appli fenetrée en swing
public class GameOfLifeUI extends JFrame {

    // dimensions de la fenetre
    private int width = 500, height = 500;

    // bordure ou pas (0 ou 1) ?
    private int border = 1;

    // choix des couleurs
    private Color couleurDeFond = Color.GRAY;
    private Color couleurCellulesVivantes = Color.ORANGE;

    // buffering pour éviter les clignotements noirs
    private Image buffer;

    // déclaration du constructeur
    public GameOfLifeUI() {
        // la ligne suivante evite de devoir killer l'appli à la fin
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // afficher la fenetre
        setVisible(true);
        // redimensionne la fenetre en prenant en compte les marges interieures
        setSize(width + getInsets().left + getInsets().right, height + getInsets().top + getInsets().bottom);
        // buffering pour éviter les clignotements noirs
        buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }

    // point d'entrée
    public static void main(String[] args) {
        // appel au constructeur
        new GameOfLifeUI();
    }

    public void paint(Graphics gr) {
        // dessinner dans le buffer
        Graphics buffer = this.buffer.getGraphics();
        // nettoyage du dessin
        buffer.setColor(couleurDeFond);
        buffer.fillRect(0, 0, width, height);
        buffer.setColor(couleurCellulesVivantes);
        // dessinner ligne par ligne ...
        for (int row = border; row < width - border; row++) {
            // ... colonne par colonne
            for (int col = border; col < height - border; col++) {
                if (Math.random() < .50)
                    buffer.fillRect(row, col, 1, 1);
            }
        }
        // prendre le buffer et dessiner l'image dans la fenetre
        gr.drawImage(this.buffer, getInsets().left, getInsets().top, null);
        // dessiner la génération suivante
        repaint();
    }

}
