package fr.imie.cours.poe.base;

import java.util.ArrayList;

public class ListInt extends ArrayList {

    public boolean add(Object o) {
        throw new IllegalArgumentException("seuls les integer sont autorisés dans cette liste");
    }

    public boolean add(Integer o) {
        return super.add(o);
    }

    public Integer get(int ii) {
        return (Integer) super.get(ii);
    }

}
