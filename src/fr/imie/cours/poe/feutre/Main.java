package fr.imie.cours.poe.feutre;

public class Main {

    public static void main(String[] args) {
        Feutre f1 = new Feutre();
        Bouchon b1 = new Bouchon();
        Feutre f2 = new Feutre();

        f1.boucher(b1);
        Bouchon b2 = f1.deboucher();
        f2.boucher(b2);

        Personne p = new Personne();
        p.recevoirMoyen(new Feutre());
        p.recevoirMoyen(new Stylo());
    }

}
