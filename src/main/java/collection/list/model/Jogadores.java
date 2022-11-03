package collection.list.model;

import java.util.Comparator;

public class Jogadores implements Comparator<Esport> {


    @Override
    public int compare(Esport e1, Esport e2) {
        return Integer.compare(e1.getNumeroJogadores(),e2.getNumeroJogadores());
    }
}
