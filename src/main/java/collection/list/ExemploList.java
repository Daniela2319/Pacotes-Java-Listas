package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        System.out.println("Cria uma lista de Alimentos");

        List<String> alimentos = new ArrayList<>();
        alimentos.add("Feijão");
        alimentos.add("Arroz");
        alimentos.add("Macarrão");
        alimentos.add("açúcar");
        alimentos.add("carne");
        alimentos.add("trigo");
        alimentos.add("pipoca");
        alimentos.add("margarina");

        // Imprimir a lista toda.
        System.out.println(alimentos.toString());

        System.out.println("Exiba a posição do alimento açúcar: " + alimentos.indexOf("açúcar"));

        System.out.println("Adicione na lista o alimento Leite na posição 5: ");
        alimentos.add(5,"Leite");
        System.out.println(alimentos);

        System.out.println("Substitua o alimento Carne por Costela:");
        alimentos.set(4,"Costela");
        System.out.println(alimentos);

        System.out.println("Confira se o alimento chocolate está na lista: " + alimentos.contains("chocolate"));

       /*System.out.println("Exiba os alimentos na ordem em que foram informados: ");
        for (String alimento : alimentos) System.out.println(alimento);*/

        System.out.println("Exiba o alimento trigo adicionada: " + alimentos.get(6));
        System.out.println(alimentos.toString());

        System.out.println("Exiba na ordem alfabética menor: " + Collections.min(alimentos));

        System.out.println("Exiba na ordem alfabética maior: " + Collections.max(alimentos));


        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(6.0);
        notas.add(5.5);


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d; // fica armazenado a soma até chega no valor: 36,3
        while (iterator.hasNext()){ // verifica se tem o proximo da lista
            Double next = iterator.next(); // se for true pego a variavel next da minha lista
            soma += next;                  // somo sete mais
        }
        System.out.println("Exiba a soma dos valores notas " + soma);

    }
}
