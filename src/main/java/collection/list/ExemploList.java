package collection.list;

import java.util.*;

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

        System.out.println("Remova da lista o alimentos pipoca: ");
        alimentos.remove("pipoca");
        System.out.println(alimentos);

        System.out.println("Exiba o alimento removido: " + alimentos.get(2));
        System.out.println("Remova da lista o macarrão está na posição 2 ");
        alimentos.remove(2);
        System.out.println(alimentos);



        List<Double> precos = new ArrayList<>();

        precos.add(7.0);
        precos.add(8.5);
        precos.add(9.3);
        precos.add(6.0);
        precos.add(5.5);


        Iterator<Double> iterator = precos.iterator();
        Double soma = 0d; // fica armazenado a soma até chega no valor: 36,3
        while (iterator.hasNext()){ // verifica se tem o proximo da lista
            Double next = iterator.next(); // se for true pego a variavel next da minha lista
            soma += next;                  // soma sete mais
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média dos valores: " + soma/precos.size());

        System.out.println("Remova da lista o preço 9.3: ");
        precos.remove(9.3d);
        System.out.println(precos);

        System.out.println("Remova os valores menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = precos.iterator();
        while (iterator1.hasNext()){ // condições se tem proximo se for true
            Double next = iterator1.next(); // iterator coloca o proximo dentro da variavel next
            if (next < 7) iterator1.remove(); // pergunta para a variavel se é menor ou maior que sete se for menor será removido
        }
        System.out.println(precos);

        System.out.println("Apague toda a lista");
        alimentos.clear();
        System.out.println(alimentos);

        System.out.println("Verifica se minha lista está vazia: " + alimentos.isEmpty() + " \n");


        LinkedList<Double> notas = new LinkedList<>();

        notas.add(7.8);
        notas.add(9.6);
        notas.add(5.9);
        notas.add(8.7);
        notas.add(6.0);

        System.out.println(notas);
        System.out.println("Exiba primeira nota: " + notas.peek());
        System.out.println(notas);

        System.out.println("Remova primeira nota da lista: " + notas.remove(0));
        System.out.println(notas);

    }
}
