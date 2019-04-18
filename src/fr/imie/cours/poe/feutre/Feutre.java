package fr.imie.cours.poe.feutre;

public class Feutre extends MoyenEcriture {

    private Bouchon b;

    public void boucher(Bouchon b) {
        if (this.b == null) {
            this.b = b;
        }
    }

    public Bouchon deboucher() {
        return this.b;
    }

}
