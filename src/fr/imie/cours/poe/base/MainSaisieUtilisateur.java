package fr.imie.cours.poe.base;

import java.util.Scanner;

public class MainSaisieUtilisateur {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("prenom : ");
        String prenom = sc.nextLine();

        System.out.print("nom : ");
        String nom = sc.nextLine();

        System.out.println("prenom : " + prenom);
        System.out.println("nom : " + nom);
    }

}
