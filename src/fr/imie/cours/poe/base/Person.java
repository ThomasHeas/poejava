package fr.imie.cours.poe.base;

public class Person {

    public String firstName;

    public String lastName;

    public static int compteur = 0;

    public Person() {
        compteur++;
    }

}
