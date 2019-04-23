package fr.imie.cours.poe.base;

import java.util.*;

public class ListString extends ArrayList {

    public boolean add(Object o) {
        throw new IllegalArgumentException("seules les strings sont autorisées dans cette liste");
    }

    public boolean add(String o) {
        return super.add(o);
    }

    public String get(int ii) {
        return (String) super.get(ii);
    }

}
