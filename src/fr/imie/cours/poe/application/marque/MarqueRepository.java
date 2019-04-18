package fr.imie.cours.poe.application.marque;

import java.util.*;

public interface MarqueRepository {

    public abstract void insert(Marque marque);
    public abstract void update(Marque marque);
    public abstract void deleteById(int id);
    public abstract Marque findById(int id);
    public abstract List<Marque> findAll();
    public abstract List<Marque> findByName(String name);

}
