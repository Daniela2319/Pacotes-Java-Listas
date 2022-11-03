package collection.list.model;

import java.util.Comparator;

public class ComparatorNomeJogadorCor implements Comparator<Esport> {
    @Override
    public int compare(Esport e1, Esport e2) {
        int nomeE = e1.getNomeE().compareToIgnoreCase(e2.getNomeE()); // comparar os nomes dos esportes
        if (nomeE != 0) return nomeE;

        int cor = e1.getCor().compareToIgnoreCase(e2.getNomeE()); // se caso forem iguais os nomes, vai comparar por cor
        if (cor != 0) return cor;

        return Integer.compare(e1.getNumeroJogadores(),e2.getNumeroJogadores()); // se as cores forem iguais, vai comparar numeros de jogadores
    }
}
