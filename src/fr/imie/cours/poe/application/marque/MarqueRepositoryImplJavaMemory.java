package fr.imie.cours.poe.application.marque;

import java.util.*;

public class MarqueRepositoryImplJavaMemory implements MarqueRepository {

    private static TreeMap<Integer, Marque> marques = new TreeMap<Integer, Marque>();

    private static int id = 1;

    public void insert(Marque marque) {
        marques.put(id, marque);
        marque.id = id++;
    }

    public void update(Marque marque) {
        marques.put(marque.id, marque);
    }

    public void deleteById(int id) {
        marques.remove(id);
    }

    public Marque findById(int id) {
        return marques.get(id);
    }

    public List<Marque> findAll() {
        return new ArrayList(marques.values());
    }

    public List<Marque> findByName(String name) {
        return marques.values().stream().filter(marque -> marque.name = name);
    }

}
