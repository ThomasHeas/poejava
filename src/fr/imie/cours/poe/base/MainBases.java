package fr.imie.cours.poe.base;

import java.lang.reflect.Array;
import java.util.*;

public class MainBases {

    public static void main(String[] args) {

        // structure à taille fixe
        String[] saisons = { "printemps", "été", "automne", "hiver" };
        System.out.println(saisons.length);

        int index = 0;
        while (index < saisons.length) {
            String saison = saisons[index];
            System.out.println(saison);
            index++;
        }

        for (int ii = 0; ii < saisons.length; ii++) {
            String saison = saisons[ii];
            System.out.println(ii + " : " + saison);
        }

        for (String saison : saisons) {
            System.out.println(saison);
        }

        // structure à taille dynamique
        List liste4 = new ArrayList();
        liste4.add("Jean");
        liste4.add("Louise");
        liste4.add("Robert");
        for (int ii = 0; ii < liste4.size(); ii++) {
            String saison = (String) liste4.get(ii);
            System.out.println(ii + " : " + saison);
        }

        List liste4bis = new ArrayList();
        liste4bis.add(5);
        liste4bis.add(4);
        liste4bis.add(3);
        for (int ii = 0; ii < liste4bis.size(); ii++) {
            int nombre = (int) liste4bis.get(ii);
            System.out.println(ii + " : " + nombre);
        }

        // liste limitée à contenir des strings
        // si on met autre chose que des strings, ça plante à l'execution
        ListString liste4ter = new ListString();
        liste4ter.add("e5");
        liste4ter.add("e4");
        liste4ter.add("e3");
        for (int ii = 0; ii < liste4ter.size(); ii++) {
            String texte = liste4ter.get(ii);
            System.out.println(ii + " : " + texte);
        }

        // liste limitée à contenir des integers
        // si on met autre chose que des integers, ça plante à l'execution
        ListInt liste4qua = new ListInt();
        liste4qua.add(5);
        liste4qua.add(4);
        liste4qua.add(3);
        for (int ii = 0; ii < liste4qua.size(); ii++) {
            Integer nombre = liste4qua.get(ii);
            System.out.println(ii + " : " + nombre);
        }

        // DEPUIS JAVA 1.5

        List<Integer> liste5 = new ArrayList<Integer>();
        liste5.add(5);
        liste5.add(4);
        liste5.add(3);
        for (Integer nombre : liste5) {
            System.out.println(nombre);
        }

        List<String> liste5bis = new ArrayList<String>();
        liste5bis.add("e5");
        liste5bis.add("e4");
        liste5bis.add("e3");
        for (String texte : liste5bis) {
            System.out.println(texte);
        }
    }

}
