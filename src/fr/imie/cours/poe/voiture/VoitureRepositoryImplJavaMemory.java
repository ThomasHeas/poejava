package fr.imie.cours.poe.voiture;

import java.util.*;

public class VoitureRepositoryImplJavaMemory implements VoitureRepository {

    private static TreeMap<Integer, Voiture> marques = new TreeMap<Integer, Voiture>();

    private static int id = 1;

    public void insert(Voiture marque) {
        marques.put(id, marque);
        marque.id = id++;
    }

    public void update(Voiture marque) {
        marques.put(marque.id, marque);
    }

    public void deleteById(int id) {
        marques.remove(id);
    }

    public Voiture findById(int id) {
        return marques.get(id);
    }

    public List<Voiture> findAll() {
        return new ArrayList(marques.values());
    }

    public List<Voiture> findByName(String name) {
        return marques.values().stream().filter(marque -> marque.name = name);
    }

}
