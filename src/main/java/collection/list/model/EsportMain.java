package collection.list.model;

import collection.list.model.Esport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EsportMain {

    public static void main(String[] args) {

        List<Esport> meusEsporte = new ArrayList<>() {{
            add(new Esport("Futebol", 11, "Verde"));
            add(new Esport("Volei", 6, "Amarelo"));
            add(new Esport("Basquete", 7, "Roxo"));
        }};

        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(meusEsporte);

        System.out.println("--\tOrdem aleatória \t--");
        Collections.shuffle(meusEsporte);
        System.out.println(meusEsporte);

        System.out.println("--\tOrdem Natural (Nome Esporte)\t--");
        Collections.sort(meusEsporte);
        System.out.println(meusEsporte);

        System.out.println("--\t Ordem Numeros de Jogadores\t--");
       // Collections.sort(meusEsporte, new Jogadores());
        meusEsporte.sort(new Jogadores());
        System.out.println(meusEsporte);

        System.out.println("--\t Ordem Cor\t--");
        meusEsporte.sort(new Cor());
        System.out.println(meusEsporte);

        System.out.println("--\t Ordem Nomes Esportes, Numeros de Jogadores e Cor\t--");
        meusEsporte.sort(new ComparatorNomeJogadorCor());
        System.out.println(meusEsporte);


    }
}
