package fr.imie.cours.poe.application.voiture;

import fr.imie.cours.poe.application.Repository;

import java.util.*;

public class VoitureRepositoryImplSql extends Repository implements VoitureRepository {

    private static final String INSERT = "INSERT INTO voiture (name) VALUES (?)";
    private static final String UPDATE = "UPDATE      voiture SET name = ? WHERE id = ?";
    private static final String DELETE = "DELETE FROM voiture WHERE id = ?";
    private static final String FIND_ALL   = "SELECT id, name FROM voiture";
    private static final String FIND_BY_ID = "SELECT id, name FROM voiture WHERE id = ?";
    private static final String FIND_BY_NAME = "SELECT id, name FROM voiture WHERE name = ?";

    public void insert(Voiture voiture) {
        // TODO INSERT
    }

    public void update(Voiture voiture) {
        // TODO UPDATE
    }

    public void deleteById(int id) {
        // TODO DELETE
    }

    public Voiture findById(int id) {
        // TODO SELECT
        return null;
    }

    public List<Voiture> findAll() {
        // TODO SELECT
        return null;
    }

}
