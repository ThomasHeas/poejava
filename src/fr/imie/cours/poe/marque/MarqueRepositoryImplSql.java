package fr.imie.cours.poe.marque;

import fr.imie.cours.poe.Repository;

import java.sql.Connection;
import java.util.*;

public class MarqueRepositoryImplSql extends Repository implements MarqueRepository {

    private static final String INSERT = "INSERT INTO marque (name) VALUES (?)";
    private static final String UPDATE = "UPDATE      marque SET name = ? WHERE id = ?";
    private static final String DELETE = "DELETE FROM marque WHERE id = ?";
    private static final String FIND_ALL   = "SELECT id, name FROM marque";
    private static final String FIND_BY_ID = "SELECT id, name FROM marque WHERE id = ?";
    private static final String FIND_BY_NAME = "SELECT id, name FROM marque WHERE name = ?";

    public void insert(Marque marque) {
        getConnection();
        // TODO INSERT
    }

    public void update(Marque marque) {
        // TODO UPDATE
    }

    public void deleteById(int id) {
        // TODO DELETE
    }

    public Marque findById(int id) {
        // TODO SELECT
        return null;
    }

    public List<Marque> findAll() {
        // TODO SELECT
        return null;
    }

    public List<Marque> findByName(String name) {
        // TODO SELECT
        return null;
    }

}
