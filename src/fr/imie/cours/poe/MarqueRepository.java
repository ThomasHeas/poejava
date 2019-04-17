package fr.imie.cours.poe;

public interface MarqueRepository {

    void insert(Marque marque);
    void update(Marque marque);
    void deleteById(int id);
    Marque findById(int id);
    List<Marque> findAll();
    List<Marque> findByName(String name);

}
