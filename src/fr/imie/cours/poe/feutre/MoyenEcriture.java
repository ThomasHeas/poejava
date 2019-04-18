package fr.imie.cours.poe.feutre;

public abstract class MoyenEcriture {

    private String couleur;
    private float epaisseur;

    public void dessiner() {
        System.out.println("Je dessine en " + couleur);
    }

    public void ecrire() {
        System.out.println("J'écris en " + couleur);
    }

}
