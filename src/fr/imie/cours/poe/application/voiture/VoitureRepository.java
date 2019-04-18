package fr.imie.cours.poe.application.voiture;

import java.util.List;

public interface VoitureRepository {

    public abstract void insert(Voiture marque);
    public abstract void update(Voiture marque);
    public abstract void deleteById(int id);
    public abstract Voiture findById(int id);
    public abstract List<Voiture> findAll();

}
