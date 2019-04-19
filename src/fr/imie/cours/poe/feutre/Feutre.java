package fr.imie.cours.poe.feutre;

public class Feutre extends MoyenEcriture {

    private Bouchon b;

    public void boucher(Bouchon b) {
        this.b = b;
    }

    public Bouchon deboucher() {
        return this.b;
    }

}
