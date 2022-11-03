package collection.list.model;

import java.util.Comparator;

public class Cor implements Comparator<Esport> {

    @Override
    public int compare(Esport e1, Esport e2) {
        return e1.getCor().compareToIgnoreCase(e2.getCor());
    }
}
