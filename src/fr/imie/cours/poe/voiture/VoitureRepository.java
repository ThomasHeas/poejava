package fr.imie.cours.poe.voiture;

import java.sql.Connection;
import java.util.List;

public interface VoitureRepository {

    public abstract void insert(Voiture marque);
    public abstract void update(Voiture marque);
    public abstract void deleteById(int id);
    public abstract Voiture findById(int id);
    public abstract List<Voiture> findAll();
    public abstract List<Voiture> findByName(String name);

}
