package fr.imie.cours.poe;

public class MarqueRepositoryImplSql implements MarqueRepository {

    private static final String INSERT = "INSERT INTO marque (name) VALUES (?)";
    private static final String UPDATE = "UPDATE      marque SET name = ? WHERE id = ?";
    private static final String DELETE = "DELETE FROM marque WHERE id = ?";
    private static final String FIND_ALL   = "SELECT id, name FROM marque";
    private static final String FIND_BY_ID = "SELECT id, name FROM marque WHERE id = ?";
    private static final String FIND_BY_NAME = "SELECT id, name FROM marque WHERE name = ?";

    public void insert(Marque marque) {
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
