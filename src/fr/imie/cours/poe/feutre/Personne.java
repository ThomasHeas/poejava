package fr.imie.cours.poe.feutre;

public class Personne {

    private MoyenEcriture moyenEcriture = new Feutre();

    public void recevoirMoyen(MoyenEcriture m) {
        this.moyenEcriture = m;
    }

    public void dessiner() {
        moyenEcriture.dessiner();
    }

}
